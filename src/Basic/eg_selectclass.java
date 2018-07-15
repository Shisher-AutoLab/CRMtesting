package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class eg_selectclass {

		@Befortest
		
		public void main()
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\chrome driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://uat2008.admin.complysandbox.com/Pages/login.aspx");
		driver.findElement(By.id("ctl00_Main_ctl00_txtEmail")).sendKeys("shisher@complyexchange.com");
		driver.findElement(By.id("ctl00_Main_ctl00_txtPassword")).sendKeys("comply");
		driver.findElement(By.id("ctl00_Main_ctl00_btnLogin")).click();
		
		}
	}


