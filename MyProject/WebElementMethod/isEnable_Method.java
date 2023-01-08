package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable_Method {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   //isEnabled()-This method is use to verify the element is enable or disable.
		   //return type of isEnabled() -boolean(true/false)
		   
		   Boolean enable=driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).isEnabled();
           System.out.println(enable);
	}

}
