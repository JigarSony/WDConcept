package pack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class JSEDemoClick {

    public static void main(String[] args) {


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/");

        System.out.println("Driver Initialized");

        driver.findElement(By.name("username")).sendKeys("a@a.in");

        //driver.findElement(By.xpath("//input[@id='persistent']")).click();

        //driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //js.executeScript("document.getElementById('persistent').click()");

        //OR

        WebElement cb = driver.findElement(By.xpath("//input[@id='persistent']"));
        js.executeScript("arguments[0].click()",cb);





    }
}
