package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		  Driver.manage().window().maximize();
		  Driver.switchTo().frame("a077aa5e");
		  Driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		  Driver.switchTo().parentFrame();
		  Driver.findElement(By.linkText("Home")).click();
		  Driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		  Driver.switchTo().frame("packageListFrame");
		  Thread.sleep(3000);
		  Driver.findElement(By.xpath("//a[@target='packageFrame']")).click();
		  
	}

}
