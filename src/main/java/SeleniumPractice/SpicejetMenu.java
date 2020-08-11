package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetMenu {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		menuClick(driver,"ctl00_HyperLinkLogin", "//a[contains(text(),'SpiceClub Members')]", "//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]");
		
		
		
		
	}
		public static void menuClick(WebDriver driver,String value1, String value2, String value3) throws InterruptedException{
			
			Actions action = new Actions(driver);
			
			Thread.sleep(7000);
			
			WebElement Login = driver.findElement(By.id(value1));
			WebElement submenu = driver.findElement(By.xpath(value2));
			WebElement memberLogin = driver.findElement(By.xpath(value3));
			
			
			action.moveToElement(Login).build().perform();
			action.moveToElement(submenu).build().perform();
			memberLogin.click();
		}
}
