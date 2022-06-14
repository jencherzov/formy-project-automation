import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nbchi\\Desktop\\Jane\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        Thread.sleep(3000);
        fileUploadField.sendKeys("C:\\Users\\nbchi\\Desktop\\Jane\\WaysToMatchText.PNG");
        Thread.sleep(3000);
        driver.quit();
    }
}
