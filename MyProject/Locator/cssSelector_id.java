package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector_id {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://login.yahoo.com/");
		 //  driver.get("https://www.facebook.com/");
		   driver.findElement(By.xpath("\\input[@id=\"login-username\"]")).sendKeys("abc@yahoo.com");
		   //1-id
		   //when in  DOM structure id is present and if you want go with 
		  
		   //cssSelector then use id attribute value and put(#)symbol before id attribute value.
		  driver.findElement(By.cssSelector("#createacc")).click();
		   
		   //2.name-In DOM structure when their is name attribute then
		  ///go with cssselector and use name attriboute value .
		  
		   //syntax-By.cssSelector(tagname#nameattributevale));
		   //driver.findElement(By.cssSelector("input#email")).sendKeys("hello123@yahoo.com");
		   //driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		//   driver.findElement(By.cssSelector("input#username")).sendKeys("abc");
		   
		   //3.class- when we use cssSelector, DOM structure when their is class attribute then we use the class attribte value.
		  //syntax-By.cssSelector("tagname.classattributevalue")
		  //if in class value their is space then remove it and put(.)
		   
		   driver.findElement(By.cssSelector("input.pure-button.puree-button-primary.challenge-button")).click();
		   
		//   Thread.sleep(2000);
	
		 //  driver.quit();
		 		   
		   

	}

}
