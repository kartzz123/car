package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iframe {
	static WebDriver driver;
	
	public static void main(String[] args) {
		  System.setProperty("webdriver.ie.driver","C:\\Users\\Selva\\Desktop\\newfolder 3\\IEDriverServer.exe");
	      driver= new InternetExplorerDriver();
	      driver.switchTo().frame("iframe1");
	      driver.quit();
	      

	}

}
