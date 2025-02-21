package popUps;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {
	
	public static void main(String[] args) throws InterruptedException {
		
        EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement NewTab=driver.findElement(By.xpath("//button[.='New Tab']"));
		NewTab.click();
		Thread.sleep(1000);
		
		Set<String>li= driver.getWindowHandles();
		Iterator<String> it=li.iterator();
		String id1=it.next();
		String id2=it.next();
		
		System.out.println(id1);
		System.out.println(id2);
		
		driver.switchTo().window(id2);
		
		WebElement component=driver.findElement(By.linkText("Components"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.moveToElement(component).perform();
		
		WebElement webcamera=driver.findElement(By.linkText("Web Cameras (0)"));
		webcamera.click();
		
		
		
		

	}
}
