package Day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Alert1
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(30);
		Alert myalert1=driver.switchTo().alert();
		System.out.println(myalert1.getText());
		myalert1.accept();
		
		//Alert2
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Alert myalert2=driver.switchTo().alert();
		System.out.println(myalert2.getText());
		myalert2.dismiss();
		
		//Alert3
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Welcome");
		Alert myalert3=driver.switchTo().alert();
		System.out.println(myalert3.getText());
		driver.switchTo().alert().accept();
		

	}

}
