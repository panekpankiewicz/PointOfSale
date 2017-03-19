package impaq;

import java.math.BigDecimal;
/**
* Point Of Sale - recruitment task.
* Product class represents product (which has bar code, name and price).
* @author Patryk Pankiewicz
*/
public class Product {
	public int barCode;
	public String productName;
	public BigDecimal price;
	
	public Product(int barCode, String productName, BigDecimal price) {
		this.barCode = barCode;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString(){
		int filler = 15 - productName.length();
		StringBuffer buffer = new StringBuffer("_");
		for (int i = 0; i<filler; i++){
			buffer.append("_");
		}
		String underscores = buffer.toString(); //certain amount of underscores ("_") provided to display prices of products in one column
		return productName + underscores + price ;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
