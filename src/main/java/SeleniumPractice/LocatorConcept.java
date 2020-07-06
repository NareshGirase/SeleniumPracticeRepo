package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		/*WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("naresh.girase21@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("naresh@1234");
		
		WebElement btn = driver.findElement(By.id("loginBtn"));
		btn.click();*/
		
		WebElement email = driver.findElement(By.xpath("//*[@id='username']"));
		email.sendKeys("naresh.girase21@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//*[@id='password']"));
		pwd.sendKeys("naresh@1234");
		
		/*WebElement btn = driver.findElement(By.xpath("//*[@id='loginBtn']"));
		btn.click();*/
		
		driver.findElement(By.linkText("Sign up")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
