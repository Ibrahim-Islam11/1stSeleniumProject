package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	//properties //variables //fields
	//methods //contain statements
	
	public static void main(String[] args) {
		
		//WebDriver object:
		WebDriver driver = new ChromeDriver();
		//Launching the website:
		driver.get("https://www.google.com");
		//maximize window:
		driver.manage().window().maximize();
		//Type in box:
		driver.findElement(By.name("q")).sendKeys("selenium");
		//click on button:
		driver.findElement(By.name("btnK")).click();
		driver.close();
		
		
		
	}

}
