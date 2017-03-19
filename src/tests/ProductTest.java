package tests;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;
import impaq.Product;
/**
* Point Of Sale - recruitment task.
* ProductTest contains unit tests of toString method as well as unit test for all getters.
* @author Patryk Pankiewicz
*/
public class ProductTest {

	BigDecimal price1 = BigDecimal.valueOf(1.23);	
	Product product1 = new Product(1, "asparagus", price1);
	BigDecimal price2 = BigDecimal.valueOf(2.54);	
	Product product2 = new Product(2, "apple", price2);

	@Test
	public void testToString() {
		assertEquals("asparagus_______1.23", product1.toString());
		assertEquals("apple___________2.54", product2.toString());	
	}

	@Test
	public void testGetBarCode() {
		assertEquals(1, product1.barCode);
		assertEquals(2, product2.barCode);
	}

	@Test
	public void testGetProductName() {
		assertEquals("asparagus", product1.productName);
		assertEquals("apple", product2.productName);
	}

	@Test
	public void testGetPrice() {
		assertEquals(price1, product1.price);
		assertEquals(price2, product2.price);
	}

}
