package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Method {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   //4.Click()-It is used to click on button,link,also use to select checkbox,radiobutton...etc
		   driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	}

}