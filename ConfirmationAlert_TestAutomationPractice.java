package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationAlert_TestAutomationPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement confirmationalert=driver.findElement(By.xpath("//button[.='Confirmation Alert']"));
		confirmationalert.click();
		Thread.sleep(2000);
		
		
		driver.switchTo().alert().accept();
		
	
	
	}
}
