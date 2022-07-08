package assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Isselected {

	public static void main(String[] args) throws InterruptedException, IOException {
		
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver Drive = new ChromeDriver();
		Drive.get("https://www.facebook.com");
		Drive.manage().window().maximize();
		Thread.sleep(3000);
		Drive.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		WebElement Female =Drive.findElement(By.xpath("//input[@value='1']"));
		Female.click();
		Thread.sleep(3000);
		File Source =((TakesScreenshot)Drive).getScreenshotAs(OutputType.FILE);
		File desk = new File("D:\\Screenshot\\imag.jpg");
		FileHandler.copy(Source, desk);
		
			     if(Female.isSelected()) { 
			        System.out.println("Search button is selected. Return:");
			     } 
			     else { 
			         System.out.println("Search button is not selected. Return:"); 
			     } 
			    Drive.close(); 
	}

}
