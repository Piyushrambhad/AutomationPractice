package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static WebDriver ref;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.navigate().to("https://google.com");
		  Driver.switchTo().newWindow(WindowType.TAB);
		  Thread.sleep(4000);
          Driver.navigate().to("https://facebook.com");
          Driver.findElement(By.id("email")).sendKeys("piyush_rambhad@yahoo.com");
          Driver.findElement(By.id("pass")).sendKeys("pgr2211");
          Driver.findElement(By.linkText("Log In")).click();
          Driver.navigate().back();
          //Driver.navigate().forward();
          //Driver.navigate().refresh();
          Driver.close();
          Driver.quit();
	}

}
