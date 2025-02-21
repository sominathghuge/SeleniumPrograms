package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleAlert_TestAutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement simplalert=driver.findElement(By.xpath("//button[.='Simple Alert']"));
		simplalert.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
	}
}
