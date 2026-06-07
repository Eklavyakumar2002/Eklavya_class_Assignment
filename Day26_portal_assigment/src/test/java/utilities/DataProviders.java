package utilities; 
import org.testng.annotations.DataProvider; 
public class DataProviders { 
@DataProvider(name = "loginData") 
public Object[][] getData() { 
return new Object[][] { 
{"nk1711336@gmail.com", "Nitesh@123"} 
}; 
} 
} 