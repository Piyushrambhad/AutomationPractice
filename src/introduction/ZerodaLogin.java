package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZerodaLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.get("https://kite.zerodha.com/");
		  Driver.manage().window().maximize();
		  Thread.sleep(4000);
		  
			WebElement Username = Driver.findElement(By.id("userid"));
			Username.sendKeys("DV1510");
			String Tag =Username.getTagName();
			System.out.println(Tag);
			WebElement Passward = Driver.findElement(By.id("password"));
			Passward.sendKeys("Goal@123");
			//Insta.ScreenShot(Driver);
			String Atr=Passward.getAttribute("id");
			System.out.println(Atr);
			WebElement button =Driver.findElement(By.className("actions"));
			//Insta.ScreenShot(Driver);
			button.click();
			Thread.sleep(3000);
	        Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("959594");
	        //Insta.ScreenShot(Driver);
	        Thread.sleep(3000);
			Driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			//Insta.ScreenShot(Driver);
			Driver.findElement(By.xpath("//span[@class='symbol']")).click();
			//Insta.ScreenShot(Driver);
			Thread.sleep(3000);
			Driver.findElement(By.xpath("//button[@class='submit']")).click();
			Thread.sleep(3000);
			//Insta.ScreenShot(Driver);
			WebElement Cancel = Driver.findElement(By.xpath("//button[@class='button-outline cancel']"));
			Cancel.click();
			System.out.println(Cancel.getText());
			Actions Act= new Actions(Driver);
			Act.moveToElement(Driver.findElement(By.xpath("(//span[text()='HDFC'])"))).perform();
			Act.moveToElement(Driver.findElement(By.xpath("//span[text()='SBIN']"))).perform();
			Thread.sleep(4000);
			Driver.findElement(By.xpath("//button[text()='S ']")).click();
			Thread.sleep(4000);
			Driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("10");
			WebElement Trigger = Driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			for(int i=0; i<5;i++) {
			Thread.sleep(3000);
			Trigger.sendKeys(Keys.ARROW_DOWN);
			}
			//Driver.findElement(By.xpath("//label[text()='SL']")).click();
			Thread.sleep(3000);
			Driver.findElement(By.xpath("(//span[text()='Sell'])[2]")).click();
			
			//Driver.findElement(By.xpath("//span[@class='icon icon-minus']")).click();
			//Thread.sleep(3000);
			
			Driver.close();
			
		  
	 }


	}


