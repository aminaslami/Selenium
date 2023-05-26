package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAA3_Locators {
   public static void main(String[] args)
   {
      // Ad chrome WebDriver
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium for Chrome - Browser\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      // (Locators) By Name - Google
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      driver.findElement(By.name("q")).sendKeys("Kabul Province - Wikipedia");
      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
   }
}