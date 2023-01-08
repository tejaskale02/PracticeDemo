package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_Method {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		 
		   //isDisplayed()-isDisplayed is used to tset weather the referance element is displayed or not.
		 //Boolean display= driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).isDisplayed();
        //   System.out.println(display);
           
          Boolean b1= driver.findElement(By.xpath("//input[@id=\"email\"]")).isDisplayed();
          System.out.println(b1);
          
	}

}
