package assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import introduction.Insta;

public class MobileList {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			
			WebDriver Drive = new ChromeDriver();
			Drive.get("http://live.techpanda.org/index.php/");
			Drive.manage().window().maximize();
			Thread.sleep(2000);
			
			//verify the Title of page
			String Title =  Drive.getTitle();
			String Expected ="Home page";
			if (Title.equals(Expected)) {
				System.out.println("THIS IS DEMO SITE");
			}
			else {
				System.out.println("THIS IS NOT DEMO SITE");	
			}
			
			//Click on Mobile Menu
			Drive.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
			
			   //Insta.ScreenShot(Drive);
			
			//In the list Sort Mobiles By Name
			WebElement Drop = Drive.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
			Drop.click();
			Select s = new Select(Drop);
			s.selectByIndex(1);
			Thread.sleep(3000);
			
              //Insta.ScreenShot(Drive);
			
            Drive.close();			
			
			
	}

}
