package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;

	public Util(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is use to create WebElements on the basis of by locator.
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getCreateElements(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Some exception occured while creating the webelement....");
			System.out.println(e.getMessage());
		}

		return element;

	}

	/**
	 * This method is use to wait for elements on the basis of explicit wait.
	 * 
	 * @param locator
	 * @param timeout
	 */

	public void waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * This method is use to click on element.
	 * 
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
			getCreateElements(locator).click();
		} catch (Exception e) {
			System.out.println("Some exception occured while clicking on the webelement....");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * This method is use to pass the values in the webelement...
	 * 
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		try {
			getCreateElements(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("Some exception occured while passing values to the webelement....");
			System.out.println(e.getMessage());
		}
	}
}
