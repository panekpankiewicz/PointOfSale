package impaq;

import java.math.BigDecimal;
import java.util.ArrayList;
/**
* Point Of Sale - recruitment task.
* ListOfProducts class represents ArrayList of Products.
* It also contains a method which generates sum of products' prices.
* @author Patryk Pankiewicz
*/
public class ListOfProducts{
	
	public static ArrayList<Product> products = new ArrayList<Product>();

	public ListOfProducts(ArrayList<Product> products){
		this.products = products;
	}

	public ListOfProducts(){
	}

	void addProduct(Product product){
		products.add(product);
	}

	public static BigDecimal sumPrices(){
		BigDecimal totalSum = BigDecimal.valueOf(0.00);
		for (int i=0; i<products.size(); i++){
			totalSum = totalSum.add(products.get(i).getPrice());
		}
		return totalSum;
	}
}
