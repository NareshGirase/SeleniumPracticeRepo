package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateConcepts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://Amazon.in");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
