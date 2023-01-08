package selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https:\\www.gmail.com");
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
		driver.navigate().back();

		driver.navigate().refresh();
		
		Dimension d= new Dimension(100,200);
		
		driver.manage().window().setSize(d);

		System.out.println(driver.manage().window().getSize());

		
		Point p= new Point(800,400);
		driver.manage().window().setPosition(p);
		
		driver.getPageSource();
		
	//	System.out.println(driver.manage().window().getPosition());
		
	//	WebElement element = driver.findElement(By.id(url));
		
		
		//driver.quit();
	}

}
