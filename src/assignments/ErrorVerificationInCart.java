package assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import introduction.Insta;

public class ErrorVerificationInCart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver Drive = new ChromeDriver();
		Drive.get("http://live.techpanda.org/index.php/");
		Drive.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on Mobiles
		Drive.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		
		//Click on Add to Cart for Sony Xperia
		Drive.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		
		//Change Quntity Value to 1000 and Click on  Update
		WebElement Qty= Drive.findElement(By.xpath("//input[@type='text']"));
		Qty.clear();
		Qty.sendKeys("1000");
		Drive.findElement(By.xpath("//button[@title=\"Update\"]")).click();
		Thread.sleep(3000);
		Insta.ScreenShot(Drive);
		
		//Verify Cart is Empty
		Drive.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		Insta.ScreenShot(Drive);
		Thread.sleep(3000);
		Drive.close();
	}

}
