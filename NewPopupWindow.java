package popUps;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NewPopupWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement window=driver.findElement(By.xpath("//button[.='Popup Windows']"));
		window.click();
		
		Set<String> li=driver.getWindowHandles();
		System.out.println(li);
		
		Iterator<String> it=li.iterator();
		String id1=it.next();
		String id2=it.next();
		String id3=it.next();
		
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id3);
		
		driver.switchTo().window(id3);
		
		WebElement register=driver.findElement(By.linkText("Register now!"));
		register.click();
		Thread.sleep(5000);
	
		driver.quit();
		
		

	}

}
