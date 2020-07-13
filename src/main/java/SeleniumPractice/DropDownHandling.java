package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.facebook.com");
		
		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		
		/*Select select = new Select(day);
		select.selectByVisibleText("21");
		
		Select select1 = new Select(month);
		select1.selectByVisibleText("Aug");
		
		Select select2 = new Select(year);
		select2.selectByVisibleText("1991");*/
		
		selectValueFromDropDown(day,"21");
		selectValueFromDropDown(month,"Aug");
		selectValueFromDropDown(year,"1991");
		
		}
	
	public static void selectValueFromDropDown(WebElement element, String value){
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
		
	}

}
