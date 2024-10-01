package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='Sunday']")).click();
		
		//select all the checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			System.out.println(i);	
		}*/
		//select last 3 checkboxes
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			System.out.println(i);
		}*/
		//select 1st three checkboxes
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
			System.out.println(i);
		}
		

	}

}
