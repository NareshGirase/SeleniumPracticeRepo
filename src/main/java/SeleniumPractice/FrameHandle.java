package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//WebElement frameElement = driver.findElement(By.name("main"));
		
		int count = driver.findElements(By.tagName("frame")).size();
		System.out.println(count);
		
		/*driver.switchTo().frame("main");
		
		WebElement text = driver.findElement(By.xpath("/html/body/h2"));
		
		System.out.println(text.getText());

		driver.switchTo().defaultContent();*/
	}

}
