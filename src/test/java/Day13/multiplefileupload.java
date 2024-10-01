package Day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplefileupload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//multiple file upload
				driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\palla\\OneDrive\\Desktop\\Diksha.txt");
				driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\palla\\OneDrive\\Desktop\\text1.txt");
				List<WebElement>multiplefile=driver.findElements(By.xpath("//ul[@id='fileList']//li"));
				multiplefile.size();
				System.out.println(multiplefile.size());
				
				for(int a=0; a<multiplefile.size(); a++) {
					String file=multiplefile.get(a).getText();
					System.out.println(file);
					String fileD="Diksha.txt";
					String fileT="text1.txt";
					if(multiplefile.get(0).getText().equals(fileD) && multiplefile.get(1).getText().equals(fileT)){
						System.out.println("succesfully upload");
						
					}else {
						System.out.println("upload failed");
					}
				}
						
				

	}

}
