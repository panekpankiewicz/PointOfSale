package impaq;

import java.math.BigDecimal;
/**
* Point Of Sale - recruitment task.
* Printer class is responsible for displaying communicates on Printer.
* Printer can display scanned products' names and prices and total sum to be paid.
* @author Patryk Pankiewicz
*/
public class Printer {

	public static void displayListOfProducts(ListOfProducts listOfProducts){		
		BigDecimal totalSum = listOfProducts.sumPrices();
		System.out.println("\nPrinter:");	
		for (int i=0; i<listOfProducts.products.size(); i++){
			System.out.println(listOfProducts.products.get(i));
		}
		System.out.println("Total sum: " + totalSum);	
	}
}
