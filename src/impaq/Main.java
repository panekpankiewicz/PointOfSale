package impaq;

import java.math.BigDecimal;
import java.sql.*;
/**
* Point Of Sale - recruitment task
* Main class is responsible for managing connection with database and interaction with user.
* @author Patryk Pankiewicz
*/
public class Main {

	public static void main(String[] args) {
		try{
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/impaq?autoReconnect=true&useSSL=false", "root", "root"); //access to my local SQL database
			Statement myStatement = myConnection.createStatement();
			ListOfProducts listOfProducts = new ListOfProducts();
			
			System.out.println("Scan your products: ");
			while(true)
			{
				String userInput = BarCodesScanner.scannedCode();
				
				if(userInput.equals("")){
					LcdDisplay.DisplayInvalidBarCode();
				}
				
				else if(userInput.equals("exit")){
					LcdDisplay.DisplayTotalSum(listOfProducts);
					Printer.displayListOfProducts(listOfProducts);
					break;
				}
				
				else{
					ResultSet myResultSet = myStatement.executeQuery("select * from products where barCode= '" + userInput + "'");

						if (myResultSet.next()){
							int barCode = Integer.parseInt(myResultSet.getString("barCode"));
							String productName = myResultSet.getString("productName");
							BigDecimal price = BigDecimal.valueOf(Double.parseDouble(myResultSet.getString("price")));	
							
							Product product = new Product(barCode, productName, price);
							listOfProducts.addProduct(product);
							LcdDisplay.DisplayNameAndPrice(product);
						}
						else
							LcdDisplay.DisplayProductNotFound();
				}			
			}
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
