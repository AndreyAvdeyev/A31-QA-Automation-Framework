import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework14 {

    @Test
    public static void Navigation() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        WebElement Registration = driver.findElement(By.xpath("//*[@id='hel']"));
        Registration.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement emailField = driver.findElement(By.cssSelector("input#email"));

        driver.quit();

    }
}