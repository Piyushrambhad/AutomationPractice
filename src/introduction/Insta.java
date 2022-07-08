package introduction;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Insta {
	public static void ScreenShot( WebDriver ref) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)ref;
		File ssFile =ss.getScreenshotAs(OutputType.FILE);
		File Destination = new File("D:\\Screenshot\\"+timestamp()+".jpg");
		FileHandler.copy(ssFile, Destination);	
	
	}
	public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		 WebDriver Driver = new ChromeDriver();
		 Driver.get("https://www.instagram.com/accounts/login");
		 Driver.manage().window().maximize();
		 Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 ScreenShot(Driver);
		 WebElement Username = Driver.findElement(By.xpath("//input[@type='text']"));
		 Username.sendKeys("piyushrambhad");
		
		 ScreenShot(Driver);
		 WebElement Passward = Driver.findElement(By.name("password"));
		 Passward.sendKeys("pgr1122");
		 Driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 ScreenShot(Driver);
		
		if(Passward.isEnabled()) {
	    	System.out.println("Password is enabled");
		}
		else {
			System.out.println("Password is disabled");
		}
		
		WebElement Login =Driver.findElement(By.xpath("//button[@type='submit']"));
		//Login.click();
		if(Login.isEnabled()) {
			System.out.println("Login is Enabled");
		}
			else {
				System.out.println("Login is Disabled");
			}
		Driver.close();
		
		}
	}

