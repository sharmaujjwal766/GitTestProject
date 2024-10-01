package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathdemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("inventory_item_name")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();	
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.id("first-name")).sendKeys("Diksha");
		driver.findElement(By.id("last-name")).sendKeys("Bharti");
		driver.findElement(By.id("postal-code")).sendKeys("560037");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		
		
		
		
				
		


	}

}
