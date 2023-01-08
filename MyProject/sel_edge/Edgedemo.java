package sel_edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edgedemo {


		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "D:\\Test Acadamy\\Selenium\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.gmail.com");
			
			
		}

	}
