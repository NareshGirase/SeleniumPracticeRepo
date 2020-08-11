package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownvalueswithoutselect {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

			/*WebElement day = driver.findElement(By.xpath("//select[@id='day']/option"));
			WebElement month =driver.findElement(By.xpath("//select[@id='month']/option"));
			WebElement year =driver.findElement(By.xpath("//select[@id='year']/option"));*/

		String day = "//select[@id='day']/option";
		String month = "//select[@id='month']/option";
		String year = "//select[@id='year']/option";
		
		selectdropdownvalueswithoutSelect( driver, day , "21");
		selectdropdownvalueswithoutSelect( driver, month, "Aug");
		selectdropdownvalueswithoutSelect( driver, year , "1991");
		
	}
	/**
	 * This method is use to select the values from drop down without using select class
	 * @param driver
	 * @param Locator
	 * @param Value
	 */

	public static void selectdropdownvalueswithoutSelect(WebDriver driver, String Locator, String Value) {

		List<WebElement> list = driver.findElements(By.xpath(Locator));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			String text = list.get(i).getText();
			// System.out.println(text);

			if (text.equals(Value)) {
				list.get(i).click();
				break;
			}

		}
	}

}
