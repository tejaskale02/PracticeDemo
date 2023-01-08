package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws InterruptedException {
		//Q.What is javaScriptExecutor - JS in an interface which is provide machnism to execute JavaScript through selenium webDriver.
		//Action we can perform using JS
		//1.Drowing the boarder around the element
		//2.Chapure title of the page
		//3.click on some element
		//4.Refrashing page
		//5.Scrolling page-1.ByPixel
							//2.ScrollingbyElement
		 					//3.Tillbottom
		//6.javacript through we pass input.
		  System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		  WebElement click= driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
		   
		clickElement(click, driver);
       
	}
	public static void clickElement(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//executeScript()-This method is use to execute javaScript
		js.executeScript("arguments[0].click()",element );		
	}

}