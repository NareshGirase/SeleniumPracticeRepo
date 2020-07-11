package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopupConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		WebElement link= driver.findElement(By.linkText("Good PopUp #3"));
		link.click();
		
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator(); //Iterator always stored in the string format thats we have stored in string
		
		
		String ParentID = it.next();
		System.out.println("Parent window ID id :"+ParentID );
		
		String ChildID = it.next();
		System.out.println("Child window ID id :"+ChildID );
		
		driver.switchTo().window(ChildID);// driver switch to child window
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentID);//driver switch to parent window
		System.out.println(driver.getTitle());
		
		WebElement link1= driver.findElement(By.linkText("Good PopUp #4"));
		link1.click();
		
		Set<String> handles1 = driver.getWindowHandles();
		
		Iterator<String> it1 = handles1.iterator();
		
		String ParentID1 = it1.next();
		System.out.println("Parent window ID id :"+ParentID1 );
		
		String ChildID1 = it1.next();
		System.out.println("Child window ID id :"+ChildID1 );
		
		driver.switchTo().window(ChildID1);// driver switch to child1 window
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(ParentID1);//driver switch to parent window
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
