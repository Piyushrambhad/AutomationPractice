package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.navigate().to("https://www.google.com");
		  Driver.manage().window().minimize();
		  Driver.manage().window().maximize();
		  Thread.sleep(5000);
		  Driver.navigate().refresh();
		  Driver.getTitle();
		  System.out.println(  Driver.getTitle());
		  //Driver.findElement(By.name("q")).sendKeys("Facebook");
		  //Driver.findElement(By.name("gNO89b")).click();
		  //Driver.findElement(By.linkText("Gmail")).click();
		  //Driver.findElement(By.linkText("Sign in")).click();
		  //Driver.findElement(By.name("identifier")).sendKeys("piyush.rambhad@gamil.com");
		  //Driver.findElement(By.cssSelector("span.VfPpkd-vQzf8d")).click();
		  //Dimension D = new Dimension(100, 800);
		  //Driver.manage().window().setSize(D);
		  Thread.sleep(4000);
		  Point P =new Point(100,400);
		  Driver.manage().window().setPosition(P);
		 //Driver.findElement(By.)
		  Thread.sleep(3000);
		 //Driver.close();
		
		  
	}

}
