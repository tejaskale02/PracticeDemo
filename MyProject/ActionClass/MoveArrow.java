package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveArrow {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		
		   driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		   Thread.sleep(3000);
		WebElement month=driver.findElement(By.xpath("(//select[@class=\"_9407 _5dba _9hk6 _8esg\"])[2]"));
		   Actions act=new Actions(driver);
		   act.moveToElement(month).click().perform();
		   for(int i=1;i<=12;i++)
		   {
			  act.sendKeys(Keys.ARROW_UP).perform(); 
		   }
		   Thread.sleep(4000);
		   for(int i=1;i<=6;i++)
		   {
			  act.sendKeys(Keys.ARROW_DOWN).perform(); 
		   }
		   
	}

}
