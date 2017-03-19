package impaq;

import java.math.BigDecimal;
/**
* Point Of Sale - recruitment task.
* LcdDisplay class is responsible for displaying communicates on LCD display.
* There are 4 types of possible LCD display communicates.
* @author Patryk Pankiewicz
*/
public class LcdDisplay{

		public static void DisplayNameAndPrice(Product product){
			System.out.println("LCD: " + product);
		}

		public static void DisplayProductNotFound(){
			System.out.println("LCD: Product not found");
		}
		
		public static void DisplayInvalidBarCode(){
			System.out.println("LCD: Invalid bar-code");
		}
		
		public static void DisplayTotalSum(ListOfProducts listOfProducts){
			BigDecimal totalSum = listOfProducts.sumPrices();			
			System.out.println("\n\nLCD: Total sum: " + totalSum);
		}

}

