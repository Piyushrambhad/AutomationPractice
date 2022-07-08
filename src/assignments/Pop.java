package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop {

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
		  Thread.sleep(3000);
		  Driver.close();
	}

}
