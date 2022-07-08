package assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import introduction.Insta;

public class MobileCostCompare {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			
			WebDriver Drive = new ChromeDriver();
			Drive.get("http://live.techpanda.org/index.php/");
			Drive.manage().window().maximize();
			Thread.sleep(2000);
			
			//Click on Mobiles
			Drive.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
			//Insta.ScreenShot(Drive);
			
			//Read The Cost of Sony Xperia
			String xperiaValue = Drive.findElement(By.cssSelector("span.price")).getText();
			System.out.println(xperiaValue);
			
			//Click on the Sony Xperia Mobile
			 Drive.findElement(By.id("product-collection-image-1")).click();
			 
			 //Value of Sony Xperia on Detail Page
			 String DetailPageValue = Drive.findElement(By.cssSelector("span.price")).getText();
			 System.out.println(DetailPageValue);
			 Insta.ScreenShot(Drive);
			 Drive.close();
			
	}

}
