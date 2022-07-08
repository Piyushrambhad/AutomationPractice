package introduction;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FlipkartLogin {
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
	}
	
	public static void Screenshot(WebDriver ref) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)ref;
		File Source = ss.getScreenshotAs(OutputType.FILE);
		File Dest = new File("D:\\Screenshot\\"+timestamp()+".jpg");
		FileHandler.copy(Source, Dest);
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.get("https://www.flipkart.com/");
		  Driver.manage().window().maximize();
		  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		  
		  
          Driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8983683403");
          Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pgr2211");
          
          //introduction.Insta.ScreenShot(Driver);
          
          Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
          
          WebElement Cart = Driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
          Actions act = new Actions(Driver);
          act.moveToElement(Cart).click().build().perform();
          act.click(Cart).perform();
          Screenshot(Driver);
          Driver.close();
          
	}

}
