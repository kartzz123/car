package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import net.sourceforge.htmlunit.corejs.javascript.ObjToIntMap.Iterator;

public class Windowhandles {
WebDriver driver;

 @Test
public void TestPopUp() throws InterruptedException{
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.naukri.com/");
	 String parent=driver.getWindowHandle();
	 java.util.Set<String> s2=driver.getWindowHandles();
	 java.util.Iterator <String>I1= s2.iterator();
	 while(I1.hasNext());
	   String child_window=I1.next();
	   if(parent.equals(child_window));
	   driver.switchTo().window(child_window);
	   System.out.println(driver.switchTo().window(child_window).getTitle());
	   driver.close();
	   driver.switchTo().window(parent);
		 
	 
	 

}
}