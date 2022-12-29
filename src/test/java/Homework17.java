import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework17 {

    @Test(enabled = true, priority = 0, description = "addSongToPlaylist")
    public static void addSongToPlaylist() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        WebElement emailField = driver.findElement(By.cssSelector("[type='Email']"));
        emailField.sendKeys("andrey.27.avd@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        passwordField.sendKeys("te$t$tudent");

        WebElement button = driver.findElement(By.cssSelector("[type='submit']"));
        button.click();

        Thread.sleep(2000);

        WebElement songs = driver.findElement(By.cssSelector("[class='songs']"));
        songs.click();

        WebElement likeButton = driver.findElement(By.cssSelector("[title='Like Episode 2 by Music Insiders By Fma'][data-test='like-btn']"));
        likeButton.click();

        WebElement playlistFavorites = driver.findElement(By.cssSelector("[class='playlist favorites']"));
        playlistFavorites.click();

        driver.findElement(By.xpath("//*[text()='Episode 2']"));

        driver.quit();
    }
}
