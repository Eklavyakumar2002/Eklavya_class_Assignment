package Day26_class_Assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_databases{

    public static void main(String[] args) throws Exception {

        String url ="jdbc:mysql://localhost:3306/newusecase";

        String dbUsername = "root";

        String dbPassword = "Eklavya2002@";

        Connection con = DriverManager.getConnection( url,dbUsername,dbPassword);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from loginusers");

        while(rs.next())
        {
            String username =rs.getString("username");

            String password = rs.getString("password");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.saucedemo.com");

            driver.findElement(By.id("user-name")).sendKeys(username);

            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.id("login-button")).click();

            driver.quit();
        }

        con.close();
    }
}
