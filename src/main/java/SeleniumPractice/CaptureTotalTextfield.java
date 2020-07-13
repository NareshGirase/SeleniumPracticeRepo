package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextfield {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php");
		
		//List<WebElement> TextFields = driver.findElements(By.tagName("input"));
		List<WebElement> TextFields = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(TextFields.size());
		
		for(int i=0;i<TextFields.size();i++){
			TextFields.get(i).sendKeys("Naresh");
		}
	}

}
