package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(logo);
		
		boolean status= driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status);
		
		boolean maleradio=driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println(maleradio);
		
		
		
		

	}

}
