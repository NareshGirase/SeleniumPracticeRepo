package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login?");

		//Thread.sleep(5000);

		By Email = By.id("username");
		By Password = By.id("password");
		By Loginbtn = By.id("loginBtn");

		Util util = new Util(driver);
		
		util.waitForElementPresent(Email, 15);
		/*
		 * util.getCreateElements(Email).sendKeys("test123@gmail.com");
		 * util.getCreateElements(Password).sendKeys("Pass@w0rd");
		 * util.getCreateElements(Loginbtn).click();
		 */

		util.doSendKeys(Email, "test123@gmail.com");
		util.doSendKeys(Password, "TEst@123");
		util.doClick(Loginbtn);

	}

}
