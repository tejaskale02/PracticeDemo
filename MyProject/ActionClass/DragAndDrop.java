package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		   driver.manage().window().maximize();
		   Actions act=new Actions(driver);
		//  WebElement source= driver.findElement(By.xpath("//div[@id=\"box1\"]"));
		//  WebElement target= driver.findElement(By.xpath("//div[@id=\"box105\"]"));
		//  Thread.sleep(3000);
		//  act.dragAndDrop(source, target).build().perform();
		  
		 // Q.Same example by using clickAndHold() and realse()
		  
		//  WebElement source= driver.findElement(By.xpath("//div[@id=\"box1\"]"));
		  WebElement target= driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		  Thread.sleep(3000);
		  act.clickAndHold(target).build().perform();
		  
		  
		  
		  
		  
		  
	}

}
