package tests;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;
import impaq.ListOfProducts;
import impaq.Product;

/**
* Point Of Sale - recruitment task.
* ListOfProductsTest contains unit test of most important function of application: generation of total sum to be paid for products.
* @author Patryk Pankiewicz
*/
public class ListOfProductsTest {

    @Test
    public void testSumPrices() {
//TODO
        BigDecimal price1 = BigDecimal.valueOf(1.24);
        Product product1 = new Product(1, "asparagus", price1);
        BigDecimal price2 = BigDecimal.valueOf(2.54);
        Product product2 = new Product(2, "apple", price2);
        ListOfProducts testList = new ListOfProducts();

        for (int i=0;i<123456;i++){
            testList.products.add(product1);
            testList.products.add(product2);
        }

        assertEquals(testList.sumPrices(), BigDecimal.valueOf(466663.68));
    }

}
