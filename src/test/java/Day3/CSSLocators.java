package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobile");
		
		//tag classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobile");
		
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("mobile");
		
		//tag class attribute
		driver.findElement(By.cssSelector("inut.search-box-text[placeholder='Search store']")).sendKeys("mobile");

		

	}

}
