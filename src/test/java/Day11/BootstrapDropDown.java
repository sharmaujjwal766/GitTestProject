package Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();//open drop down option
		//Select single option
		driver.findElement(By.xpath("//input[@value='java']")).click();
		//capture all the option and find out the size
		List<WebElement> options=driver.findElement(By.xpath("/ul[contains(@class,'mutiselect')]//label"));
		System.out.println("No of options:"+options.size());

	}

}
