package Day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\palla\\OneDrive\\Desktop\\Diksha.txt");
		WebElement Actualfilename=driver.findElement(By.xpath("//ul[@id='fileList']//li"));
		String Actualfile=Actualfilename.getText();
		System.out.println(Actualfile);
		
		String Expectedfile="Diksha.txt";
		if(Expectedfile.equals(Actualfile)) {
			System.out.println("successfully uploaded");
		}else {
			System.out.println("upload failed");
		}
			
		

	}
	
	
		
	
	
	
	
	

	}
