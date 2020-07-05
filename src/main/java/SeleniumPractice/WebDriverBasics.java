package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Selenium setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String Title =(driver.getTitle());
		
		System.out.println("Title");
		
		if (Title.equals("Google")) 
		{
			System.out.println("Tilte is correct");
		} 
		else 
		{
			System.out.println("Title is incorrect");
		}

		driver.quit();

	}

}
