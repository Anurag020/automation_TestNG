package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base {
	
	
	public WebDriver driver;
	
	@Test
	public void testTwo() throws IOException, InterruptedException {
		System.out.println("User Three has updated this code");
		driver = initializeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
