package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TillBottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.w3schools.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   
		   //scrolldown
		   js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		   Thread.sleep(3000);
		   
		   //scrollup
		   js.executeScript("document.documentElement.scrollTop=0","args");
		   
		   

	}

}