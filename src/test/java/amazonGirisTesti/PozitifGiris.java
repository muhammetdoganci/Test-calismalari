package amazonGirisTesti;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PozitifGiris {

        @Test
        public void positiveTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.amazon.com");
        WebElement signIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        signIn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement eMail = driver.findElement(By.id("ap_email"));
        eMail.sendKeys("mhmmtdgn30@gmail.com");

        WebElement continueClick = driver.findElement(By.id("continue"));
        continueClick.click();

        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("m14531453d");


        WebElement signInClick = driver.findElement(By.id("signInSubmit"));
        signInClick.click();

        WebElement verification = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        verification.isDisplayed();
        System.out.println(verification.getText());

        driver.close();

    }


}
