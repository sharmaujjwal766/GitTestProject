package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://id.atlassian.com/login");
		driver.manage().window().maximize();
		driver.close();

	}

}
