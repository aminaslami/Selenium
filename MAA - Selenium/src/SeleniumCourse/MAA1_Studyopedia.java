package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.Key;

public class MAA1_Studyopedia {
   public static void main(String[] args) {

      System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Selenium for Edge - Browser\\edgedriver_win64\\msedgedriver.exe");

      WebDriver driver = new EdgeDriver();

      driver.manage().window().maximize();

      driver.get("https://www.google.com/");

      driver.findElement(By.name("q")).sendKeys("Amin Aslami", Keys.ENTER);
   }
}
