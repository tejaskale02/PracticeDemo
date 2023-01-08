package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://demo.automationtesting.in/Register.html");
		   driver.findElement(By.tagName("textarea")).sendKeys("abc");
		   driver.findElement(By.xpath("\\input[@class=\"form-control ng-invalid ng-touched ng-dirty ng-invalid-email ng-valid-required\"]")).sendKeys("abc@gmail.com");

}
}
