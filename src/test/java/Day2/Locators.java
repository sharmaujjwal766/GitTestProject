package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplaystatus);
		
		//linktext
		driver.findElement(By.linkText("Tablets")).click();
		
		//classname
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("total number of header links:"+headerLinks.size());
		
		//tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+links.size());
		
		
		

	}

}
