import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConcept {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "./chromedriver_78.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //maximisie window
        driver.manage().deleteAllCookies(); //delete all cookies

        //dynamic wait or Implicit wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //wait for 40s and then the page will timeout
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //applicable for all elements in the page

        driver.get("https://classic.crmpro.com/");
    }
}
