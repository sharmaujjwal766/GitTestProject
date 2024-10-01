package Day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(10);
		driver.manage().window().maximize();
		
		//frame
		driver.switchTo().frame(0);
		
		//method1:Using Sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/10/2024");
		
		//method2
		//1.click the datepicker box
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String Expecteddate="12";
		String Expectedmonth="August";
		String Expectedyear="2000";
		
		//take xpath for month and year
		while(true) {
		String Actualmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Actualyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	//	System.out.println( Actualmonth +"Actualmonth");
	//	System.out.println( Actualyear +"Actualyear");
		if(Expectedmonth.equals(Actualmonth) && Expectedyear.equals(Actualyear)) {
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();	
		}
		//Date Picker
		List<WebElement> Actualdate=(List<WebElement>)driver.findElement(By.xpath("/table[@class='ui-datepicker-calender']//tbody//tr//td"));
		
		for(WebElement Actual_date:Actualdate) {//for each
			if( Actual_date.getText().equals(Expecteddate)) {
				 Actual_date.click();
				 break;
			}
		}
		
		
		

	}

}
