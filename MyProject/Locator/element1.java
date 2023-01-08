package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class element1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("8208807583");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Tejas123");
	
		driver.findElement(By.xpath("//button[@id=\"u_0_5_2W\"]")).click();

		
		
	}
}
