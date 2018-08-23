package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class i_frame_2 {


static WebDriver driver;

public static void main(String[] args) {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\Selva\\Desktop\\newfolder 3\\IEDriverServer.exe");
      driver= new InternetExplorerDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		WebElement iframeElement = driver.findElement(By.id("IF1"));
		driver.switchTo().frame(iframeElement);
		driver.quit();
}
}