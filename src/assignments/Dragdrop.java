package assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args)throws InterruptedException, IOException {
		
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver Drive = new ChromeDriver();
		Drive.get("https://demoqa.com/droppable");
		Drive.manage().window().maximize();
		WebElement Source = Drive.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(3000);
		WebElement Dest = Drive.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(Drive);
		act.dragAndDrop(Source, Dest).perform();
		act.doubleClick().perform();
		Thread.sleep(3000);
		//introduction.Insta.ScreenShot(Drive);
		//WebElement scroll =Drive.findElement(By.xpath(null));
		JavascriptExecutor js =((JavascriptExecutor)Drive);
			js.executeScript("window.scrollBy(0,1000)");
			//js.executeScript("arguments[0].srcollIntoView(true);"scroll);
	}
	
}
