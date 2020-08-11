package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String date ="21-Aug-1991";
		String[] dateval = date.split("-");
		
		DropDownConcept.selectValueFromDropDown(day, dateval[0]);
		DropDownConcept.selectValueFromDropDown(month, dateval[1]);
		DropDownConcept.selectValueFromDropDown(year, dateval[2]);
		
		ArrayList<String> daylist = getDropDownValues(day);
		System.out.println(daylist);
		ArrayList<String> monthlist = getDropDownValues(month);
		System.out.println(monthlist);
		ArrayList<String> yearlist = getDropDownValues(year);
		System.out.println(yearlist);
	}
/**
 * This method is use to get all the values from the drop down
 * @param element
 */
	public static ArrayList<String> getDropDownValues(WebElement element) {
		
		System.out.println("===============================");
		Select select = new Select(element);
		
		List<WebElement> dayslist = select.getOptions();
		System.out.println("Total numbers of vlaues in the drodown: " + dayslist.size());
		
		ArrayList<String> ar = new ArrayList<String>();

		for (int i = 0; i < dayslist.size(); i++) {

			String text = dayslist.get(i).getText();
			ar.add(text);
			//System.out.println(text);
		}
		
		return ar;
	}

}
