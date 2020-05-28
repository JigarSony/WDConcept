package pack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardEvent2 {

    public static void main(String[] args) {


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/key_presses?");

        System.out.println("Driver Initialized");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ESCAPE).perform();

        if(driver.findElement(By.xpath("//p[text()='You entered: ESCAPE']")).getText().contains("ESCAPE")){
            System.out.println("Pass");
        }else{System.out.println("Fail");}
    }

}
