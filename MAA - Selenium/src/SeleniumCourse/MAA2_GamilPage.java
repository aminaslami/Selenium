package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MAA2_GamilPage {
   public static void main(String[] args) {
      // Ad chrome WebDriver
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium for Chrome - Browser\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      // Go to gmail-account
      driver.get("https://www.google.com/gmail/about/");
      driver.manage().window().maximize();

      // Find the element and click there.
      driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/a[2]")).click();
      // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[2]")).click();
      // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("amin@gmail.com");
      driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("af.mahdi@gmail.com");

      // Check the page title value.
      String pageTitle = driver.getTitle();
      String titleValue = "Gmail";

      // Control the title value name.
      if(pageTitle.equalsIgnoreCase(titleValue)){

         System.out.println("This is Gmail Sign Official PAGE");
      }
      else{
         System.out.println("This is not Gmail PAGE");
      }
   }
}
