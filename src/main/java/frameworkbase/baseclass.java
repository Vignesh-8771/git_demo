package frameworkbase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass implements baseint {

	// long timeouts = 30;

	// int maxWaitTime = 10;

	RemoteWebDriver driver = null;

	WebDriverWait wait = null;

	@Override
	public void setup(String url) {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get(url);

		// wait = new WebDriverWait(driver, maxWaitTime);

		// wait = new WebDriverWait(driver, null, null)

	}

	public void setup(browser browsername, String url) {

		switch (browsername) {

		case Chrome:

			driver = new ChromeDriver();

			break;

		case EDGE:

			driver = new EdgeDriver();

			break;

		case FireFox:

			driver = new FirefoxDriver();

			break;
		default:

			System.err.println("browser not defined");
			break;
		}
		// driver.manage().timeouts().implicitlyWait(maxWaitTime, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(url);

	}

	@Override
	public void close() {

		driver.close();
	}

	@Override
	public void quit() {

		driver.quit();
	}

	@Override
	public WebElement element(locators type, String value) {

		switch (type) {

		case id:

			return driver.findElement(By.id(value));

		case name:

			return driver.findElement(By.name(value));

		case xpath:

			return driver.findElement(By.xpath(value));

		case link:

			return driver.findElement(By.linkText(value));

		default:
			break;
		}

		return null;
	}

	@Override
	public void switchtowindow(int i) {

	}

	@Override
	public void selectvalue(WebElement ele, String value) {

	}

	@Override
	public void selecttext(WebElement ele, String value) {

	}

	@Override
	public void selectindex(WebElement ele, int index) {

	}

	@Override
	public void click(WebElement ele) {

		WebElement element = wait.withMessage("Element is not clickable")
				.until(ExpectedConditions.elementToBeClickable(ele));

		ele.click();

	}

	@Override
	public void type(WebElement ele, String testdata) {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));

		element.clear();

		element.sendKeys(testdata);
	}

	public void type(WebElement ele, String testdata, Keys keys) {

		// WebElement element =
		// wait.until(ExpectedConditions.elementToBeClickable(ele));

		ele.clear();

		ele.sendKeys(testdata, keys);

	}

	@Override
	public void clear(WebElement ele) {

	}

	@Override
	public String geturl() {

		return null;
	}

	@Override
	public String gettitle() {

		return null;
	}

	@Override
	public boolean isdispalyed() {

		return false;
	}

	@Override
	public void setup(String browsername, String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void appendtext(WebElement ele, String testdata) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isdispalyed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}
}
