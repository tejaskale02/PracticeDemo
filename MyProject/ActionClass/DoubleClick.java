package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		 		
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		   driver.manage().window().maximize();
		   Actions act=new Actions(driver);
		  WebElement doubleclick= driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		  Thread.sleep(2000);
		  act.doubleClick(doubleclick).build().perform();
		  Thread.sleep(4000);
		  driver.switchTo().alert().accept();

	}

}
