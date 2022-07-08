package assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Velocity {

	public static void main(String[] args) throws InterruptedException, IOException {
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			
			WebDriver Drive = new ChromeDriver();
			Drive.get("https://vctcpune.com/selenium/practice.html");
			Drive.manage().window().maximize();
			Thread.sleep(3000);
			Drive.findElement(By.xpath("//input[@value='Radio1']")).click();
			WebElement Dropdown =Drive.findElement(By.id("dropdown-class-example"));
			Dropdown.click();
			Select Option = new Select(Dropdown);
		    Option.selectByValue("option1");
		    Thread.sleep(3000);
		    
			File Source =((TakesScreenshot)Drive).getScreenshotAs(OutputType.FILE);
			File desk = new File("D:\\Screenshot\\imag4.jpg");
			FileHandler.copy(Source, desk);
			
		    Option.selectByIndex(2);
		    Thread.sleep(3000);
		    Option.selectByVisibleText("Option3");
		    WebElement Radio = Drive.findElement(By.id("openwindow"));
		    String Text=Radio.getText();
		    System.out.println(Text);
			//Drive.close();

   }
}