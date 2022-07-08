package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raja {

	public static void main(String[] args) {
		
		
 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

  WebDriver Driver = new ChromeDriver();
  Driver.get("https://www.flipkart.com");
  Driver.switchTo().newWindow(WindowType.WINDOW);
  Driver.get("https://web.whatsapp.com");
  Driver.manage().window().maximize();
 System.out.println(Driver.getTitle());
 System.out.println(Driver.getCurrentUrl());
 Driver.close();
 //Driver.quit();

	}

}
