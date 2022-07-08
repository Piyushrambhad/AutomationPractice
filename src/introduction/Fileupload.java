package introduction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			
			WebDriver Drive = new ChromeDriver();
			Drive.get("https://demo.guru99.com/test/upload/");
			Drive.manage().window().maximize();
			Thread.sleep(3000);
			WebElement uploadElement = Drive.findElement(By.id("uploadfile_0"));
			uploadElement.sendKeys("D:\\Screenshot\\Screenshot3.jpg");
			 Drive.findElement(By.id("terms")).click();
			 Drive.findElement(By.name("send")).click();
			 Thread.sleep(3000);
			 Insta.ScreenShot(Drive);
			 Drive.close();
			 
			
	}

}
