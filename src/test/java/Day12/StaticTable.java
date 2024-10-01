package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//total number of rows in a table
		//int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//System.out.println("Number of rows:"+rows);//7
		
		//total number of column in a table
		//int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//System.out.println("number of columns:"+cols);
		
		//read data from the specific row and column
		String bookname=driver.findElement(By.xpath("//table[@name='Booktable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);//Master in selenium
		
		//read data from all the rows and column
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
			}
		}
		

	}

}
