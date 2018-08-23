package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Scroll {
WebDriver driver;

@Test
public void pixdel() {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\Selva\\Desktop\\newfolder 3\\IEDriverServer.exe"); 	
      driver= new InternetExplorerDriver();
      JavascriptExecutor js= (JavascriptExecutor)driver;
      driver.manage().deleteAllCookies();
      driver.get("https://www.naukri.com/");
      driver.manage().window().maximize();
      js.executeScript("window.scrollby(0 1000)");
          
      
}
}
