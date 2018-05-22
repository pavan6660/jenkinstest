package pavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test
{
	WebDriver driver;
     @Test
     public void login() 
     {
    	 
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ariatech9\\Downloads\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	 driver.get("http://primusbank.qedgetech.com/");
    	 driver.close();
     }
}
