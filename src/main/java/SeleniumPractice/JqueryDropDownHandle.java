package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("justAnInputBox")).click();

		// selectChoiceValues(driver, "choice 2", "choice 2 3", "choice 6 2 3");
		selectChoiceValues(driver, "all");

	}

	public static void selectChoiceValues(WebDriver driver, String... Values) {

		List<WebElement> ChoiceList = driver.findElements(
				By.xpath("// div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		System.out.println(ChoiceList.size());

		if (!Values[0].equalsIgnoreCase("ALL")) {
			for (int i = 0; i < ChoiceList.size(); i++) {
				String text = ChoiceList.get(i).getText();
				System.out.println(text);

				for (int k = 0; k < Values.length; k++) {
					if (text.equals(Values[k])) {
						ChoiceList.get(i).click();
						break;
					}
				}

			}
		} else {
			for (int all = 0; all < ChoiceList.size(); all++) {
				ChoiceList.get(all).click();
			}
		}
	}

}
