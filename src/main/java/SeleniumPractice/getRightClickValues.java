package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getRightClickValues {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			ArrayList<String> list = getRightclickvalues(driver,"context-menu-one","context-menu-icon");
			System.out.println(list);
			
			}
			
			public static ArrayList<String> getRightclickvalues(WebDriver driver,String value1,String value2){
				
				
				WebElement RightClick = driver.findElement(By.className(value1));
				
				Actions action = new Actions(driver);
				
				action.contextClick(RightClick).build().perform();
				
				List<WebElement> rightclickvalues = driver.findElements(By.className(value2));
				System.out.println(rightclickvalues.size());
				
				ArrayList<String> ar = new ArrayList<String>();
				
				for(int i=0;i<rightclickvalues.size();i++){
					
					String text = rightclickvalues.get(i).getText();
					ar.add(text);
					
					//System.out.println(text);
					
			

	}
				return ar;
}
}
