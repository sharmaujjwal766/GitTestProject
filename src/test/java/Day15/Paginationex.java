package Day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationex {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Total cell count
		List<WebElement>cell=driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr//td"));
		cell.size();//20
		System.out.println(cell.size());
		
		//Total page count
		List<WebElement>page=driver.findElements(By.xpath("//ul[@class='pagination']//li//a"));
		page.size();//4
		System.out.println(page.size());
		
		//Total row count
		List<WebElement>row=driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr"));
		row.size();//5
		System.out.println(row.size());
		

	}

}
