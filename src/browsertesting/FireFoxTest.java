package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseURL = "https://opensource-demo.orangehrmlive.com/";// Storing the baseURl
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");//Setting webdriver
        WebDriver driver = new FirefoxDriver();//Creating object of chrome driver
        driver.get(baseURL);// Method to invoke URL
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

