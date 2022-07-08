package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Login {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			
			WebDriver Drive = new ChromeDriver();
			Drive.get("https://www.demo.guru99.com/V4/");
			Drive.manage().window().maximize();
			Thread.sleep(2000);
			Drive.findElement(By.xpath("//input[@type='text']")).sendKeys("piyush.rambhad@gamil.com");
			Drive.findElement(By.xpath("//input[@type='password']")).sendKeys("pgr8983683403");
			WebElement Login =Drive.findElement(By.xpath("//input[@type='submit']"));
			Login.click();
			Alert alt =Drive.switchTo().alert();
			Thread.sleep(5000);	
			String msg = alt.getText();
			System.out.println(msg);
			alt.accept();
			Drive.close();
	}

}
