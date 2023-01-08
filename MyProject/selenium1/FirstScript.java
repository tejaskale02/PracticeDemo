
package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	static WebDriver driver;

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Test Acadamy\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	public static void main(String[] args) {

		FirstScript obj = new FirstScript();
		obj.launchBrowser();
		System.out.println(driver.getTitle());
		
	//	String s= driver.getPageSource();
	//	System.out.println(s);
		
		String s1= driver.getWindowHandle();
		System.out.println(s1);
		
	}

}
