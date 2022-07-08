package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.flipkart.com");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Driver.navigate().back();
		
		Thread.sleep(3000);
		Driver.navigate().forward();
		
		Driver.navigate().to("https://facebook.com");
		
		
		String URL = Driver.getCurrentUrl();
		
		System.out.println(URL);
		

	}

}
