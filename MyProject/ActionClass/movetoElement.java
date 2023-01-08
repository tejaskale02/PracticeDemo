package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoElement {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		   Actions act=new Actions(driver);
		  WebElement login= driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		  act.moveToElement(login).build().perform();
		  
		  driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		   

	}

}