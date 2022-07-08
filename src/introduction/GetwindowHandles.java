package introduction;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandles {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.get("https://www.w3schools.com/js/js_popup.asp");
		  Driver.manage().window().maximize();
		  Thread.sleep(4000);
		  
		  WebElement alert = Driver.findElement(By.xpath("(//a[contains(text(), 'Try it Yourself')])[1]"));
		  WebElement Confirm = Driver.findElement(By.xpath("(//a[contains(text(), 'Try it Yourself')])[2]"));
		  WebElement Promote = Driver.findElement(By.xpath("(//a[contains(text(), 'Try it Yourself')])[3]"));
		  WebElement LinkBreak = Driver.findElement(By.xpath("(//a[contains(text(), 'Try it Yourself')])[4]"));
		  alert.click();
		  Thread.sleep(3000);
		  Confirm.click();
		  Thread.sleep(3000);
		  Promote.click();
		  Thread.sleep(3000);
		  LinkBreak.click();
		  String main = Driver.getWindowHandle();
		  System.out.println(main);
		  
		  ArrayList<String> add = new ArrayList<String>(Driver.getWindowHandles());
		  
		  for(int i=0; i<add.size(); i++)
		  {	  
		String a= add.get(i);
		System.out.println(a);
		Driver.switchTo().window(a);
		System.out.println(Driver.getCurrentUrl()); 
		 }
	}

}
