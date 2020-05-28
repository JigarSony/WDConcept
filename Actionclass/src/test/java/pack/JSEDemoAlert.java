package pack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class JSEDemoAlert {

    public static void main(String[] args) {


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        System.out.println("Driver Initialized");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("alert('Welcome Jigar')");


    }
}
