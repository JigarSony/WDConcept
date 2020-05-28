package pack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionIntro {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Actions act = new Actions(driver);
        //act.contextClick(); -- right click
        //act.tick(); -- for mobile devices
        //act.perform(); -- for single action
        //act.build().perform(); -- for multiple(more than one action) action
    }
}
