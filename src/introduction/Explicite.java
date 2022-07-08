package introduction;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		 WebDriver Driver = new ChromeDriver();
		 Driver.get("https://www.facebook.com/login/");
		 Driver.manage().window().maximize();
		// Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Driver.findElement(By.id("email")).sendKeys("piyush_rambhad@yahoo.com");
		 Driver.findElement(By.id("pass")).sendKeys("pgr2211");
		 Driver.findElement(By.id("loginbutton")).click();
	     WebDriverWait wait1 = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Live video']"))).click();
		 Thread.sleep(5000);
		 Driver.close();
		 
	}

}
