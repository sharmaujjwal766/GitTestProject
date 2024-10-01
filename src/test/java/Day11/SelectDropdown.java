package Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropCountry=new Select(dropCountryEle);
		
		//Select Option from the drop down
		//dropCountry.selectByVisibleText("India");
		//dropCountry.selectByValue("France");
		//dropCountry.selectByIndex(2);
		
		//Capture the option from the drop down
		List<WebElement>options=dropCountry.getOptions();
		System.out.println("Number of options in drop down:"+options.size());
		
		//printing the options
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}


	}

}
