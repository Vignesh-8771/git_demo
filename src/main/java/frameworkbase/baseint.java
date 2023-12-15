package frameworkbase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
public interface baseint {
	/**
	 * 
	 * @param url discription - to lanuch the Chrome browser with given url
	 */

	public void setup(String url);

	/**
	 * 
	 * @param browsername - to open with different browser
	 * @param url
	 * @param browsername exception
	 */

	public void setup(browser browsername, String url);

	/**
	 * @param to close the browser
	 * 
	 * 
	 */

	public void close();

	/**
	 * @param to quite the browser
	 * 
	 */

	public void quit();

	/**
	 * 
	 * @param type
	 * @param value
	 * @return
	 */

	WebElement element(locators type, String value);

	/**
	 * 
	 * @param switching from window
	 */

	public void switchtowindow(int i);

	/**
	 * @param -     selecting value in dropdown
	 * @param ele
	 * @param value
	 */

	public void selectvalue(WebElement ele, String value);

	/**
	 * @param
	 */

	public void selecttext(WebElement ele, String value);

	/**
	 * 
	 * @param ele
	 * @param index
	 */

	public void selectindex(WebElement ele, int index);

	/**
	 * @param to click the element
	 * 
	 */

	public void click(WebElement ele);

	/**
	 * @param to clear the entered text and type in the feild
	 */

	public void type(WebElement ele, String testdata);
	/**
	 * 
	 * @param ele
	 * @param testdata
	 * 
	 *                 discription - to enter the given data
	 */

	/*
	 * public void typeandclick (WebElement ele, String testdata, Keys keys);
	 * 
	 *//**
		 * 
		 * @param ele
		 *//*
			*/
	public void appendtext(WebElement ele, String testdata);

	/**
	 * @param to clear the entered text
	 */

	String geturl();

	String gettitle();

	boolean isdispalyed(WebElement ele);

	void setup(String browsername, String url);

	boolean isdispalyed();

}
