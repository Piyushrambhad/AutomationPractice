package introduction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
		  //Driver.manage().window().maximize();
		  Driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		  Alert alt = Driver.switchTo().alert();
		  String msg1 =alt.getText();
		  System.out.println(msg1);
		  Thread.sleep(3000);
		  alt.accept();
		  Driver.findElement(By.name("confirmalertbox")).click();
		  Thread.sleep(3000);
		  String msg2 = alt.getText();
		  System.out.println(msg2);
		  alt.dismiss();
		  Driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();
		  String msg3 = alt.getText();
		  System.out.println(msg3);
		  alt.sendKeys("Yes");
		  alt.accept();
		  Driver.switchTo().newWindow(WindowType.TAB);
		  Driver.navigate().to("https://demoqa.com/alerts");
		  Driver.findElement(By.id("promtButton")).click();
		  alt.sendKeys("Piyush");
		  alt.accept();
		  Thread.sleep(3000);
		  Driver.close();
		  
		  

	}

}
