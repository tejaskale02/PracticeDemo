package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("redmi");
		   Thread.sleep(2000);
		   //sendkey in search box and get no of size to sugestion of given send data.
		List<WebElement>AllOptions=driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]//div"));
		System.out.println(AllOptions.size());
		   Thread.sleep(2000);
		   
		  //print all list of suggestions by realated to send data 
		   for(WebElement option:AllOptions)
		   {
			   String act_text=option.getText();
			   if(act_text.equals("redmi"))
			   {
				   option.click();
			   }
						   
		   }
		   
		   driver.quit();
	}

}
