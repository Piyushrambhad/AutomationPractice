package introduction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.navigate().to("https://www.facebook.com");
		  Driver.manage().window().maximize();
		  
		WebElement Username = Driver.findElement(By.id("email"));
		Username.sendKeys("piyush_rambhad@yahoo.com");
		WebElement Passward = Driver.findElement(By.id("pass"));
		Passward.sendKeys("pgr2211");
		WebElement Login =Driver.findElement(By.xpath("//button[@value='1']"));
		Login.click();
		Insta.ScreenShot(Driver);
	}

}
