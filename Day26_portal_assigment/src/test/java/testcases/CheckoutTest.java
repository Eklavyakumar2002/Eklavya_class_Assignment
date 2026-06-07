package testcases; 
 
import org.testng.annotations.Test; 
 
import base.BaseClass; 
import pages.CartPage; 
import pages.CheckoutPage; 
import pages.SearchPage; 
 
public class CheckoutTest extends BaseClass { 
 
    @Test 
    public void checkoutTest() throws InterruptedException { 
 
        SearchPage sp = new SearchPage(driver); 
        CartPage cp = new CartPage(driver); 
        CheckoutPage ch = new CheckoutPage(driver); 
 
        // Search Product 
        sp.searchProduct("iPhone"); 
 
        Thread.sleep(3000); 
 
        // Add To Cart 
        cp.addProductToCart(); 
 
        Thread.sleep(3000); 
 
        // Proceed Checkout 
        ch.proceedCheckout(); 
 
Thread.sleep(3000); 
System.out.println("Checkout Process Started"); 
} 
}