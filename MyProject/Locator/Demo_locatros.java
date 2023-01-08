package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_locatros {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.redbus.in/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Solapur");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//li[@data-id='646']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Nagpur");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//li[@data-id=\"624\"]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		   Thread.sleep(3000);
		  // driver.findElement(By.xpath("//td[@class=\"current day\" and contains(text(),'30')]")).click();
		//   driver.findElement(By.xpath("//td[@class=\"next\"]/button")).click();
		   driver.findElement(By.xpath("//td[@class=\"wd day\" and contains(text(),'16')]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("search_btn")).click();
		  Thread.sleep(5000);
		 //  driver.close();
		   

	}

}
