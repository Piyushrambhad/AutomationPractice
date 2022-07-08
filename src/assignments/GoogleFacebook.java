package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFacebook {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver Drive = new ChromeDriver();
		Drive.get("https://www.google.com");
		Drive.manage().window().maximize();
		Drive.get("https://www.facebook.com");
		Thread.sleep(2000);
		Drive.navigate().back();
		Thread.sleep(3000);
		Dimension D = new Dimension(200, 400);
		Drive.manage().window().setSize(D);
		Thread.sleep(2000);
		Point P = new Point(100, 500);
		Drive.manage().window().setPosition(P);
		Drive.manage().window().maximize();
		Thread.sleep(2000);
		Drive.navigate().to("https://www.facebook.com");
		Drive.navigate().refresh();
		Thread.sleep(2000);
		Drive.close();
		
		
	}

}
