package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuynamicWebTable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement text= driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
			js.executeScript("arguments[0].scrollIntoView()",text);
		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		for(int i=1;i<=row;i++)
		{
			int col;
			if(i==1)
			{
			col=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//th")).size();
			}
			else
			{
				col=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//td")).size();
			}
			for(int j=1;j<=col;j++)
			{
				if(i==1)
				{
				WebElement alldata=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//th["+j+"]"));
				String text1=alldata.getText();
				System.out.print(text1 +"|");
				}
				else
				{
					WebElement alldata=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//td["+j+"]"));
					String text2=alldata.getText();
					System.out.print(text2+"|");
				}
			}
			System.out.println();
		}
		

	}

}