package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://demo.nopcommerce.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		  
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		 Flash(logo, driver);
		   
		
	}
public static void changeColor(String color,WebElement element,WebDriver driver)
{
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].style.backgroundColor='"+color+" '",element);
try
{
	Thread.sleep(2000);
}
catch(InterruptedException e)
{
	
}
	
}
public static void Flash(WebElement element,WebDriver driver)
{
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=0;i<10;i++)
	{
		changeColor("#FF5733",element,driver);
		changeColor(bgcolor,element,driver);
	}
	
}
	
	
}