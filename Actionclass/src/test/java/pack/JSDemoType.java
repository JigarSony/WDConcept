package pack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class JSDemoType {

    public static void main(String[] args) {

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/");

        System.out.println("Driver Initialized");

        WebElement email = driver.findElement(By.name("username"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("arguments[0].value='a@a.in'", email);
        //OR
        js.executeScript("arguments[0].value=arguments[1]", email,"a@a.in");

    }
}

