package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HHSautomation {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://shipcom-iot-ui-dev.azurewebsites.net/");

		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		// Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("shahrzad@shipcomwireless.com");
		driver.findElement(By.id("password")).sendKeys("Shipcom12345");
		driver.findElement(By.id("btn-login")).click();

		// Thread.sleep(50000);
		By Popup = By.id("onesignal-slidedown-cancel-button");

		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Popup));

		driver.switchTo().activeElement();
		// System.out.println(driver.getTitle());
		WebElement alert = driver.findElement(Popup);
		alert.click();

		/*
		 * String parent = driver.getWindowHandle();
		 * System.out.println("Parent window Id is "+ parent);
		 * 
		 * Set<String> allwindow = driver.getWindowHandles();
		 * System.out.println(allwindow.size()); for(String child:allwindow){
		 * 
		 * if(!parent.equalsIgnoreCase(child)){
		 * 
		 * driver.switchTo().window(child);
		 * System.out.println(driver.getTitle()); WebElement alert =
		 * driver.findElement(By.id("onesignal-popover-cancel-button"));
		 * alert.click(); } }
		 * 
		 * Thread.sleep(25000); driver.switchTo().window(parent);
		 * System.out.println(driver.getTitle());
		 */
		// *[@id="main-content"]/app-trip-planner/div/app-truck-list/div/div[2]/div[1]/div/div[2]/div

		By createTrip = By.xpath("//img[@src='assets/img/icons/tripplanning-icon.svg']");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 150);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(createTrip));

		WebElement TripPlanner = driver.findElement(createTrip);
		TripPlanner.click();

		By add = By.xpath("//button[@class='btn-filter']");

		WebDriverWait wait2 = new WebDriverWait(driver, 150);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(add));

		WebElement AddButton = driver.findElement(add);
		AddButton.click();

		By truck = By.xpath("//div[contains(text(),'18-1772')]");

		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(add));

		WebElement SelectTruck = driver.findElement(truck);
		SelectTruck.click();

		// Actions truck = new Actions(driver);
		// truck.moveToElement(SelectTruck).click();

		// WebElement path =
		// driver.findElement(By.xpath("/html/body/app-root/app-navbar/div/div[1]/div[2]/ul/li[9]/a/img)"));
		// path.click();
		//
		// WebElement addButton =
		// driver.findElement(By.xpath("//*[@id='main-content']/app-trip-planner-list/div[1]/div/div/div[2]/div[2]/button[3]"));
		// addButton.click();

		// Alert alert = driver.switchTo().alert();
		// alert.dismiss();

		// div[contains(text(),'18-1772')]

	}

}
