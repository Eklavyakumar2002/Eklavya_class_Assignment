package testcases; 
import org.testng.annotations.Test; 
import base.BaseClass; 
import pages.CartPage; 
import pages.SearchPage; 
public class CartTest extends BaseClass { 
@Test 
public void addToCartTest() throws InterruptedException { 
 
        SearchPage sp = new SearchPage(driver); 
        CartPage cp = new CartPage(driver); 
 
        // Search Product 
        sp.searchProduct("iPhone"); 
 
        Thread.sleep(2000); 
 
        // Add Product To Cart 
        cp.addProductToCart(); 
 
        Thread.sleep(2000); 
 
        System.out.println("Product Added To Cart Successfully"); 
    } 
}