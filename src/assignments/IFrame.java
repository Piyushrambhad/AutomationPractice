package assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import introduction.Insta;

public class IFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver Drive = new ChromeDriver();
		Drive.get("http://demo.automationtesting.in/Frames.html");
		Drive.manage().window().maximize();
		
        //Click on iframe with in an iframe
        Drive.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        
        //1st iframe
        WebElement Outer= Drive.findElement(By.xpath("//*[@id='Multiple']/iframe"));
        
        Drive.switchTo().frame(Outer);

        //2nd iframe
        WebElement inner = Drive.findElement(By.xpath("/html/body/section/div/div/iframe"));
        
        Drive.switchTo().frame(inner);
        
        //3rd iframe
        Drive.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
        Insta.ScreenShot(Drive);
	}
}