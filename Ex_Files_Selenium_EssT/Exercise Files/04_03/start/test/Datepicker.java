import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nbchi\\Desktop\\Jane\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

       // WebElement dateField = driver.findElement(By.id("datepicker"));
        //dateField.sendKeys("03/03/2020");
        WebElement dataDate = driver.findElement(By.cssSelector("class=datepicker-switch"));
      //  dateField.sendKeys(Keys.RETURN); //press enter key

        driver.quit();

    }
}