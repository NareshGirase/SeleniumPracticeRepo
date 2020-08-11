package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size() - 1;

		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]

		for (int rowNumber = 2; rowNumber <= rowCount+1; rowNumber++) {

			String actualXpath = beforeXpath + rowNumber + afterXpath;
			String Value = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(Value);

		}

	}

}
