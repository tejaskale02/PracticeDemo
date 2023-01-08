package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Border {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
	
		  WebElement img= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		  drowBorder(img,driver);
	}
	public static void drowBorder(WebElement element,WebDriver  driver)
	{
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].style.border='5px solid red'",element);
	}

}