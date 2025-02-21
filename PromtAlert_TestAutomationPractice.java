package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PromtAlert_TestAutomationPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find xpath for promt alert pop up on page
		WebElement promptalert=driver.findElement(By.xpath("//button[.='Prompt Alert']"));
		promptalert.click();

		//Switch control from parent to pop up
		Alert alt= driver.switchTo().alert();

		alt.sendKeys("Raju");
		alt.accept();

		String txt=alt.getText();
	    System.out.println(txt);
	}
}
