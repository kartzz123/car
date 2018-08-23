package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		  System.setProperty("webdriver.ie.driver","C:\\Users\\Selva\\Desktop\\newfolder 3\\IEDriverServer.exe"); 	
		  WebDriver driver = new InternetExplorerDriver();
		  driver.get("https://www.google.co.in/");
      	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
    	WebElement to=driver.findElement(By.xpath("//*[@id='credit2']/a"));
        Actions act=new Actions(driver);	
        act.dragAndDrop(From, to).build().perform();
        
        
	}

} 
