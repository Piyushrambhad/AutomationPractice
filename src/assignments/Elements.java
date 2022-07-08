package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
	
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver Drive = new ChromeDriver();
		Drive.get("https://www.google.com");
		Drive.manage().window().maximize();
		Drive.findElement(By.name("q")).sendKeys("tata");
		Thread.sleep(3000);
	List<WebElement> elements=Drive.findElements(By.xpath("//ul[@class='erkvQe']//li"));
	System.out.println(elements.size());
	

//    for (int i=0; i<elements.size();i++){
//      System.out.println("List of Honda bikes: " + elements.get(i).getText());
//    }
//    elements.get(4).click();

	for(WebElement l : elements) {
		System.out.println(l.getText());
	}
	
//	String expected = "honda shine";
//	String Actual = l.getText();
//
//    if(expected.equals(Actual)) {
//	System.out.println("condition is true");
//    l.click();
//    break;
//    }
  }
	}




