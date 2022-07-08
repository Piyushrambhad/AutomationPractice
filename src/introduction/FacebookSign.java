package introduction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FacebookSign {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		 WebDriver Driver = new ChromeDriver();
		  Driver.get("https://www.facebook.com/signup");
		  Driver.manage().window().maximize();
		  Thread.sleep(4000);
		  WebElement Firstname = Driver.findElement(By.xpath("//input[@type='text']")); //Sign UP Page
			Firstname.sendKeys("Vijay");
			WebElement Lastname= Driver.findElement(By.xpath("//input[@name='lastname']"));
			Lastname.sendKeys("Goal@123");
			WebElement Mobile= Driver.findElement(By.xpath("//input[@name='reg_email__']"));
			Mobile.sendKeys("8877441210");
			WebElement Passward = Driver.findElement(By.xpath("//input[@type='password']"));
			Passward.sendKeys("Goal@245");
			WebElement Day = Driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select D =new Select(Day);
			D.selectByValue("4");
			WebElement Month = Driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select M =new Select(Month);
			M.selectByIndex(10);
			WebElement year = Driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select s =new Select(year);
			s.selectByValue("1992");
			Driver.findElement(By.xpath("//input[@value='2']")).click();
			
			File Src=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE); //ScreenShot Code
			File Desk= new File("D:\\Screenshot\\imag1.jpg");
			FileHandler.copy(Src, Desk);
			
			WebElement SignUP= Driver.findElement(By.xpath("//button[@type='submit']"));							
			SignUP.click();
			WebElement Already= Driver.findElement(By.partialLinkText("Already"));							
			Already.click();
			Thread.sleep(3000);
	        System.out.println("Radio Button Option 1 Selected");
	        Driver.close();
		  
	}

}
