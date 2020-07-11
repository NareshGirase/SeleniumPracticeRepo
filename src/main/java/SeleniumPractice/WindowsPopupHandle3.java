package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopupHandle3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		
		getLinks(driver, "Good PopUp #3");
		getLinks(driver, "Good PopUp #4");
		
	}
	
	public static void getLinks(WebDriver driver, String link){
		
		driver.findElement(By.linkText(link)).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String ParentWindowId = it.next();
		System.out.println("parent window id is: "+ ParentWindowId);

		String childWindowId = it.next();
		System.out.println("child window id is: "+ childWindowId);

		driver.switchTo().window(childWindowId);

		System.out.println("child window title is: "+ driver.getCurrentUrl());

		driver.close();

		driver.switchTo().window(ParentWindowId);

		System.out.println("parent window title is: "+ driver.getTitle());
		
	}

}
