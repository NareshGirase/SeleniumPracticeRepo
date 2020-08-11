package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageImplicitleyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login?");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement EmailID = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("loginBtn"));
		
		EmailID.sendKeys("abc@gmail.com");
		Password.sendKeys("abc@123");
		LoginButton.click();
		
		
		
	}

}
