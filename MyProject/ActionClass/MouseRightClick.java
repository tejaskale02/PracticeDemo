package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		   driver.manage().window().maximize();
		   Actions act=new Actions(driver);
		WebElement button= driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Thread.sleep(3000);
		//when we perform action- mouse rigth click  then we use contextClick()
		act.contextClick(button).perform();
		driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		

	}

}
