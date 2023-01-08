package Guru;

import java.sql.Driver;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class login_page {
	
	public static WebDriver driver;
	private static String value;
	
	public static void login() throws InterruptedException {
		
		/* ChromeOptions opt= new ChromeOptions();
         HashMap<String, Integer> conentSetting = new HashMap<String, Integer>();
         HashMap<String, Object> profile = new HashMap<String, Object>();
         HashMap<String, Object> prefs = new HashMap<String, Object>(); 
         
         conentSetting.put("notifications", 1);
         profile.put("managed_default_content_settings", conentSetting);
         prefs.put("profile", profile);
         opt.setExperimentalOption("prefs", prefs); */
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		
		
	//	 opt.addArguments("disable-notifications");
		 
	    driver =new ChromeDriver();
	    driver.get("https://demo.guru99.com/V4/");
	    driver.manage().window().maximize();
	   
    driver.findElement(By.name("uid")).sendKeys("mngr464571");
    Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys("Yzyhyty");
    Thread.sleep(2000);
    driver.findElement(By.name("btnLogin")).click();
    Thread.sleep(2000);
  
    WebElement t =driver.findElement(By.linkText("New Customer"));
		t.click();
		
	     Thread.sleep(2000);
	    
	      driver.navigate().back();
		  driver.navigate().forward();
  //   driver.switchTo().frame("ad_iframe");
    

 //    driver.findElement(By.xpath("\\button[@id=\"dismiss-button\"]")).click();   
     }
	
	public static void new_customer() throws InterruptedException {
	  
		driver.findElement(By.name("name")).sendKeys("rohit");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='rad1' and @value='f']")).click();
	
	
	    driver.findElement(By.name("dob")).sendKeys("08/25/1998");
	    driver.findElement(By.name("addr")).sendKeys("mumbai");
	    driver.findElement(By.name("city")).sendKeys("mumbai");
	    Thread.sleep(2000);
	    driver.findElement(By.name("state")).sendKeys("Maharashtra");
	    driver.findElement(By.name("pinno")).sendKeys("425500");
	    driver.findElement(By.name("telephoneno")).sendKeys("9018554422");
	    Thread.sleep(2000);
	    driver.findElement(By.name("emailid")).sendKeys("15599@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("123456");
	    Thread.sleep(2000);
	    driver.findElement(By.name("sub")).click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	   // WebElement alert = driver.findElement (By.xpath ("//*[contains(text(),'Save address?')]"));
	       driver.switchTo().alert().accept();            		
	}
	public static void edit_customer() throws InterruptedException{
	  
      WebElement d =driver.findElement(By.linkText("Edit Customer"));
      d.click();
      
      driver.findElement(By.name("cusid")).sendKeys("73381");
      driver.findElement(By.name("AccSubmit")).click();
      Thread.sleep(2000);
      driver.findElement(By.name("emailid")).clear();
      Thread.sleep(2000);

      driver.findElement(By.name("emailid")).sendKeys("ram99@gmail.com");
      driver.findElement(By.name("sub")).click();
      
      WebElement h =driver.findElement(By.linkText("Home"));
      h.click();
      
  }
	public static void new_account() throws InterruptedException
	  {
		  WebElement d =driver.findElement(By.linkText("New Account"));
			d.click();
			Thread.sleep(2000);
		    driver.findElement(By.name("cusid")).sendKeys("90029");
		    Select account =new Select (driver.findElement(By.name("selaccount")));
		    account.selectByValue("Savings");
		    driver.findElement(By.name("inideposit")).sendKeys("2000");
		    driver.findElement(By.name("button2")).click();
		    
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,200)");
		 
		   WebElement a =driver.findElement(By.linkText("Continue"));
			a.click();
	  }

 
	public static void edit_account() throws InterruptedException{
	  
      WebElement e =driver.findElement(By.linkText("Edit Account"));
      e.click();
      Thread.sleep(2000);
      
      driver.findElement(By.name("accountno")).sendKeys("117244");
      WebElement s=driver.findElement(By.name("AccSubmit"));
      s.click();
      Thread.sleep(2000);
    //  driver.switchTo().alert().accept();
  
}
	public static void delete_account() throws InterruptedException
	 {
		  
			 WebElement e =driver.findElement(By.linkText("Delete Account"));
		      e.click();
		      
		      
		      driver.findElement(By.name("accountno")).sendKeys("117243");
		      WebElement s=driver.findElement(By.name("AccSubmit"));
		      s.click();
		 //     Thread.sleep(2000);
		    //  driver.switchTo().alert().dismiss();
	 }
	public static void delet_customer() throws InterruptedException{
	  
      WebElement e =driver.findElement(By.linkText("Delete Customer"));
      e.click();
      
      
      driver.findElement(By.name("cusid")).sendKeys("73381");
      WebElement s=driver.findElement(By.name("AccSubmit"));
      s.click();
      Thread.sleep(2000);
      driver.switchTo().alert().dismiss();
  
}
}
	
