package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		  System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   //clear()-return type WebElement.
		 //  2.clear()-This methos is use to clear value in the textfield.
		   //1st way-
		   //Identfy and perform actions on different statement one element perform different /multiple actions using object name/ref. name .
		 WebElement clear1= driver.findElement(By.xpath("//input[@id=\"email\"]"));
		    clear1.sendKeys("hello@gmail.com");
		    Thread.sleep(2000);
		    clear1.clear();
		    
		    //2.way
		  //To identify and perform action in same satement (one statement only perform one action)  
		   //   driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
			   //2.clear()-
			//   Thread.sleep(2000);
			  // driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
			   
			 
			   
	}

}
