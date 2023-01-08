package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_example {

		public static void main(String[] args) throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
			   WebDriver driver=new ChromeDriver();
			   driver.get("https://www.youtube.com/");
			   driver.manage().window().maximize();
			   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Selenium");
			   driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();

			   
	}

}
