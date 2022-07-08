package introduction;

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


public class AirtelWebsite {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		  WebDriver Driver = new ChromeDriver();
		  Driver.navigate().to("https://airtel.in");
		  Driver.manage().window().maximize();
		  Driver.findElement(By.cssSelector("h3.actions-heading")).click();
		  Driver.get("https://www.airtel.in/prepaid-recharge/?icid=header");
		  Driver.findElement(By.id("txtMobile")).sendKeys("8983683403");
		  Driver.navigate().back();
		  Driver.get("https://www.airtel.in/prepaid-4g-sim/?icid=header");
		  Driver.findElement(By.name("name")).sendKeys("Piyush Rambhad");
		  Driver.findElement(By.name("mobileNumber")).sendKeys("8955772210");
		  Driver.findElement(By.cssSelector("span.inner-label")).click();
		  Driver.findElement(By.name("address")).sendKeys("Amravati");
		  Driver.findElement(By.name("flatFloor")).sendKeys("92");
		  Driver.findElement(By.className("field")).sendKeys("110001");
		  Driver.findElement(By.cssSelector("div.field-group")).click();
		 
			File Source =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
			File desk = new File("D:\\Screenshot\\imag3.jpg");
			FileHandler.copy(Source, desk);
			
		  Thread.sleep(5000);
		  Driver.navigate().back();
		  Driver.get("https://www.airtel.in/ir-packs/?icid=header");
		  Driver.findElement(By.cssSelector("input.cursor-pointer")).sendKeys("USA");
		  Thread.sleep(5000);
		  Driver.findElement(By.xpath("//body/main[@id='root']/div[2]/section[2]/article[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("8983683403");
		  Driver.navigate().back();
		  Driver.findElement(By.id("quickRechargeInput")).sendKeys("8977225510");
		  Driver.navigate().back();
		  Driver.findElement(By.linkText("Get App")).click();
		  Driver.navigate().back();
		  Driver.findElement(By.linkText("Store")).click();
		  Driver.navigate().back();
		  Driver.findElement(By.linkText("Login")).click();
		  Driver.findElement(By.name("mobileNumber")).sendKeys("8983683403");
		  Driver.findElement(By.id("pasword")).sendKeys("1234");
		  Driver.findElement(By.id("loginButtonSpan")).click();
		  Driver.navigate().back();
		  //Driver.findElement(By.xpath("Switch Prepaid to Postpaid")).click();
		  //Thread.sleep(4000);
		  //Driver.navigate().to("https://airtel.in");
		//String URL=Driver.getCurrentUrl();
		//System.out.println(URL);
		  Driver.close();
		  //Select dropdown = new Select(Driver.findElement(By.cssSelector("h3.actions-heading")));
		  //dropdown.selectByVisibleText("Recharge");
	
		  
		  
	}

}
