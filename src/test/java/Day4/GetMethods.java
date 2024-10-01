package Day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource();
		//System.out.println(driver.getPageSource());
		//String windowid=driver.getWindowHandle();
		//System.out.println(windowid);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
		
		
		
		
		
		

	}

}
