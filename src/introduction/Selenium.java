package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

    WebDriver Driver = new ChromeDriver();
    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    Driver.get("https://rahulshettyacademy.com/locatorspractice/");
    Driver.manage().window().maximize();
    Driver.findElement(By.id("inputUsername")).sendKeys("Piyush");
    Driver.findElement(By.name("inputPassword")).sendKeys("hello123");
    Driver.findElement(By.className("submit")).click();
    System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
    Driver.manage().window().maximize();
    Driver.switchTo().newWindow(WindowType.TAB);
    Driver.get("https://google.com");
    System.out.println(Driver.getTitle());
    System.out.println(Driver.getCurrentUrl());
    //Driver.close();
    //Driver.quit();
   
    
 
	}

}
