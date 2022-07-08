package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			
			WebDriver Driver = new ChromeDriver();
			Driver.get("http://live.techpanda.org/index.php/");
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Driver.findElement(By.xpath("(//a[contains(text(),'My Account')])[2]")).click();
			Driver.findElement(By.xpath("//a[@class='button']")).click();
			Driver.findElement(By.id("firstname")).sendKeys("Piyush");
			Driver.findElement(By.id("middlename")).sendKeys("Gajanan");
			Driver.findElement(By.id("lastname")).sendKeys("Rambhad");
			Driver.findElement(By.id("email_address")).sendKeys("piyush.rambhad@gmail.com");
			Driver.findElement(By.id("password")).sendKeys("pgr8983683404");
			Driver.findElement(By.xpath("//input[@name='confirmation']")).sendKeys("pgr8983683404");
			Driver.findElement(By.id("is_subscribed")).click();
	
			Driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
			//Driver.close();
			
			
	}

}
