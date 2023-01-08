package sel_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Test Acadamy\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
	}

}
