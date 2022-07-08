package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver Drive = new ChromeDriver();
		Drive.get("https://www.google.com");
		Drive.manage().window().maximize();
		Thread.sleep(2000);
		Dimension D = new Dimension(400, 800);
		Drive.manage().window().setSize(D);
		Thread.sleep(3000);
		Point P = new Point(100, 400);
		Drive.manage().window().setPosition(P);
		Thread.sleep(3000);
		Drive.close();
		
	}

}
