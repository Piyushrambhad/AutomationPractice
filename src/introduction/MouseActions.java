package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		 WebDriver Driver = new ChromeDriver();
		  Driver.get("https://www.amazon.in/");
		  Driver.manage().window().maximize();
		  Thread.sleep(4000);
		  WebElement Sign = Driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		  
		  Actions act = new Actions(Driver);
		 act.moveToElement(Sign).perform();
		 act.click().perform();
		 act.contextClick(Sign).perform();
		
		 
	}

}
