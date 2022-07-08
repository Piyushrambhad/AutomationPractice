package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			
			WebDriver Drive = new ChromeDriver();
			Drive.get("https://demoqa.com/checkbox");
			Drive.manage().window().maximize();
			Drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println(Drive.findElement(By.cssSelector("svg.rct-icon rct-icon-uncheck")).isSelected());
			Drive.findElement(By.cssSelector("svg.rct-icon rct-icon-uncheck")).click();
			Drive.close();
			
			
	}

}
