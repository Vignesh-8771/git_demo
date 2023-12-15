package TC001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import frameworkbase.baseclass;
import frameworkbase.browser;
import frameworkbase.locators;

public class case1 extends baseclass{
	
	@Test
	void searchletcode () throws InterruptedException 
	{
		
		
		setup(browser.EDGE, "https://www.google.com/");
		
	//	WebElement search = element(locators.name, "q");
		
		
   type(element(locators.name, "q"), "the bear",Keys.ENTER);
		
		
	//	Thread.sleep(3000);
		
		
	
		}
	
	
	}
	
	
	


