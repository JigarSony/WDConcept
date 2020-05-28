package pack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardEvent {

    public static void main(String[] args) {


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //driver.get("https://the-internet.herokuapp.com/key_presses?");

        driver.get("https://www.facebook.com/");

        System.out.println("Driver Initialized");
        Actions act = new Actions(driver);
        driver.findElement(By.name("firstname")).sendKeys("a");
        act.sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(1))
                .sendKeys("b")
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(1))
                .sendKeys("1234567890")
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(1))
                .sendKeys("1234567890")
                .build().perform();

    }

}
