package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		//Thread.sleep(5000);
		
		
		
		WebElement SourceElement = driver.findElement(By.id("draggable"));
		WebElement TargetElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		
		
		action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
		
		//action.dragAndDrop(SourceElement, TargetElement).build().perform();

	}

}
