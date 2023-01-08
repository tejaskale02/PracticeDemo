package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser1 {
	
	WebDriver driver;

	@Parameters("Browsername")
	@Test

public void login(String Browsername)
{
	if(Browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(Browsername.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "D:\\Test Acadamy\\Selenium\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	else if(Browsername.equals("firefox"))
	{
		 System.setProperty("webdriver.gecko.driver","D:\\Test Acadamy\\Selenium\\geckodriver.exe");
		  driver=new FirefoxDriver();
	}
	
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
		
}
}