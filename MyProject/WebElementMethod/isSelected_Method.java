package WebElementMethod;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_Method {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Test Acadamy\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   //isSelected()-This method is use to check the element is selected or not.
		   //reteurn type-boolean
		   boolean b= driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).isSelected();
		   System.out.println(b);
		
//		   if(driver.findElement(By.className("_8esh")).isSelected()==false)
//		   {
//			   driver.findElement(By.className("_8esh")).click();
//		   }
//		   else
//		   {
//	         System.out.println( driver.findElement(By.className("_8esh")).isSelected());
//		   }
		   
	}

}