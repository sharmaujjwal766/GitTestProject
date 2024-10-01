package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//XPath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mobile");
		//XPath with multiple attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']"));
		

	}

}
