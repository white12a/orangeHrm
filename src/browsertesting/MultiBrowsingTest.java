package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class MultiBrowsingTest {
    static String browser = "FIREFOX";
    static String baseURL ="https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
             driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
             driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
             driver = new EdgeDriver();
        } else {
            System.out.println("not valid browser");
        }
        driver.get(baseURL);// launch URL
        driver.manage().window().maximize();//Maximising the windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Timeout session
        String title = driver.getTitle();//Storing the title of the page
        System.out.println("Title of the page: " + title);//Printing the title of the page
        String currentURL = driver.getCurrentUrl();//Method to get Current Url of the page
        System.out.println(currentURL);//printing the current  URL of the page
        WebElement userNameField = driver.findElement(By.id("txtUsername"));//Storing the usernamefield
        userNameField.sendKeys("Admin");//send keys to username field
        WebElement passwordField = driver.findElement(By.id("txtPassword"));// storing the password field
        passwordField.sendKeys("admin123");// sending keys to password field
        driver.close();//Closing the driver

    }
}
