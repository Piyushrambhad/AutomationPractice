package introduction;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		 WebDriver Driver = new ChromeDriver();
		 Driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		 Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 for(int i=1;i<=26;i++) {
			 WebElement Contact= Driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td[2]"));
				System.out.println(Contact.getText());
		 }
		
//		 Driver.get("http://demo.guru99.com/test/web-table-element.php");
		 
//		 for(int i=1;i<=26;i++) {
//		 WebElement Row = Driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td[4]"));
//		 System.out.println(Row.getText());
//		 }
		
//		 for(int i=1;i<=26;i++) {
//			 WebElement Col= Driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td[2]"));
//			 System.out.println(Col.getText());
			 
		 }
		 
		
	}


