package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Demo.webTable;

public class KeyBoardAction1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://text-compare.com/");
			
			Thread.sleep(3000);
					
			
		WebElement input1=	driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));

		
		Thread.sleep(3000);
		
		input1.sendKeys("This is my first java program");
			
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		  // Select the Current Address using CTRL + A
		    act.keyDown(Keys.CONTROL);
		  act.sendKeys("a");
	        act.keyUp(Keys.CONTROL);
	        act.build().perform();
	        
	        // Copy the Current Address using CTRL + C
	        act.keyDown(Keys.CONTROL);
	        act.sendKeys("c");
	        act.keyUp(Keys.CONTROL);
	        act.build().perform();
	       
	        
	        //Press the TAB Key to Switch Focus to Permanent Address
	        act.sendKeys(Keys.TAB);
	        act.build().perform();
	        
	        //Paste the Address in the Permanent Address field using CTRL + V
	        act.keyDown(Keys.CONTROL);
	        act.sendKeys("v");
	        act.keyUp(Keys.CONTROL);
	        act.build().perform();
	       
		
		// Comapre Text
		WebElement input2=	driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Correct copied");
		else
			System.out.println("Not Copied");
	}

}