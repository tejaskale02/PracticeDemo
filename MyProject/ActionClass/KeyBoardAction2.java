package ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://the-internet.herokuapp.com/key_presses");
		   driver.manage().window().maximize();
		   Actions act=new Actions(driver);
		   act.sendKeys(Keys.CONTROL).build().perform();
		   Thread.sleep(4000);
		   act.sendKeys(Keys.SHIFT).build().perform();
		   Thread.sleep(4000);
		   act.sendKeys(Keys.SPACE).build().perform();
		   Thread.sleep(4000);
		   act.sendKeys(Keys.ESCAPE).build().perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.F1).build().perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.F7).build().perform();
		   Thread.sleep(4000);
		   act.sendKeys(Keys.DELETE).build().perform();
	}

}
