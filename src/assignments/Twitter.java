package assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Twitter {

	public static void main(String[] args) throws IOException, InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        
		WebDriver Drive = new ChromeDriver();
		Drive.get("https://twitter.com/i/flow/login");
		Drive.manage().window().maximize();
		Thread.sleep(3000);
		Drive.findElement(By.xpath("//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']")).click();
		//File Source =((TakesScreenshot)Drive).getScreenshotAs(OutputType.FILE);
		//File Desk = new File("D:\\Screenshot\\imag2.jpg");
		//FileHandler.copy(Source, Desk);
	    introduction.Insta.ScreenShot(Drive);
		Drive.close();
		
	}

}
