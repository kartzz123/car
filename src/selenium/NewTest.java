package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import net.sourceforge.htmlunit.corejs.javascript.Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	{
}
    public WebDriver driver;

  @Test (priority = 1)
  public void screenshotWebElement() throws IOException {
	  try{
 
	  driver.findElement(By.xpath("mTxt")).sendKeys("login");
	  
	  }
	  
	  catch (Exception e){
		  System.out.println("print exception");
		  getscreenshot();
	  }
	  }
	 
      

  public void getscreenshot() throws IOException {
      java.io.File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	  
	FileUtils.getFile(scrFile,"C:\\Users\\Selva\\Downloads");
	
}
@BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\Selva\\Desktop\\newfolder 3\\IEDriverServer.exe"); 	
	  WebDriver driver = new InternetExplorerDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.google.co.in/");
	  driver.navigate().to("https://www.naukri.com/");
	  driver.manage().window().maximize();
	  
	  		 

  }
}
