package assignments;

import java.util.List;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlist {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			WebDriver Drive = new ChromeDriver();
			Drive.get("https://www.flipkart.com/");
			Drive.manage().window().maximize();
			Drive.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile");
			Drive.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Drive.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		List<WebElement> elements=Drive.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']//li"));
		System.out.println(elements.size());

		for (int i=0; i<elements.size();i++){
	      System.out.println("List of mobiles: " + elements.get(i).getText());
	    }
	}
}


