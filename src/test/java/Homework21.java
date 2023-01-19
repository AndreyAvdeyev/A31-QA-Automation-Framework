import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class Homework21 extends BaseTest {

    @Test
    public void renamePlaylist() throws InterruptedException {
        String playlistName = "Homework21";
        String renamedPlaylist = "Renamed";

        login("andrey.27.avd@gmail.com", "te$t$tudent");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@title='Create a new playlist']"))).click();

        WebElement newPlaylist = driver.findElement(By.xpath("//li[text()='New Playlist']"));
        newPlaylist.click();

        WebElement nameField = driver.findElement(By.xpath("//input[@name='name']"));
        nameField.clear();
        nameField.sendKeys(playlistName, Keys.ENTER);

        Actions a = new Actions(driver);
        WebElement renamePlaylist = driver.findElement(By.xpath("//li/a[text()='"+playlistName+"']"));
        a.contextClick().perform();

        WebElement newPlaylistName = driver.findElement(By.xpath("//li[text()='Edit']"));
        newPlaylistName.click();

        nameField.clear();
        nameField.sendKeys(renamedPlaylist, Keys.ENTER);
    }
}
