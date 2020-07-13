package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("Https://amazon.in");

		List<WebElement> LinksList = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links:" + LinksList.size());

		
		for (int i = 0; i < LinksList.size(); i++) {
			String text = LinksList.get(i).getText();
			if(text.equals(null)||text.isEmpty()){
				continue;
			}else
			{
				System.out.println(text);
			}
			

		}
	}

}
