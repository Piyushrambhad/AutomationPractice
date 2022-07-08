package assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import introduction.Insta;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver Drive = new ChromeDriver();
		Drive.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");
		Drive.manage().window().maximize();
		Drive.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("Piyushrambhad");
		Drive.findElement(By.id("num1")).sendKeys("20");
		Drive.findElement(By.id("num2")).sendKeys("30");
		Drive.findElement(By.xpath("//button[contains(text(), 'Get Sum')]")).click();
		WebElement Dropdown = Drive.findElement(By.id("testingDropdown"));
		Select s = new Select(Dropdown);
		s.selectByVisibleText("Performance Testing");
	    Drive.findElement(By.id("male")).click();
	    Thread.sleep(5000);
	    Drive.findElement(By.id("seleniumtest")).click();
	    WebElement File =  Drive.findElement(By.xpath("//input[@name='uploadsubmit']"));
	    File.sendKeys("D:\\Screenshot\\Screenshot3.jpg");
	    Thread.sleep(3000);
	    //Insta.ScreenShot(Drive);
	    //Drive.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	    //Insta.ScreenShot(Drive);
	    Thread.sleep(3000);
	    WebElement Drag = Drive.findElement(By.id("draga"));
	    WebElement Drop = Drive.findElement(By.id("dragb"));
	    Actions act = new Actions(Drive);
	    act.dragAndDrop(Drag, Drop);
	    Thread.sleep(3000);
	    Drive.close();
	}

}
