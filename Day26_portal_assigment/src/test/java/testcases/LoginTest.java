package testcases; 
import org.testng.annotations.Test; 
import base.BaseClass; 
import pages.LoginPage; 
import utilities.DataProviders; 
public class LoginTest extends BaseClass { 
@Test( 
dataProvider = "loginData", 
dataProviderClass = 
DataProviders.class) 
public void loginTest( 
String email, 
String password) 
            throws Exception { 
 
        LoginPage lp = 
                new LoginPage(driver); 
 
        lp.clickMyAccount(); 
 
        Thread.sleep(3000); 
 
        lp.clickLogin(); 
 
        Thread.sleep(3000); 
 
        lp.enterEmail(email); 
 
        lp.enterPassword(password); 
 
        Thread.sleep(3000); 
 
        lp.clickLoginButton(); 
 
        Thread.sleep(4000); 
 
        System.out.println( 
                "Login Test Executed"); 
} 
}