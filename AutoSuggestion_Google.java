package seleniumConcept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AutoSuggestion_Google {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
		
        SoftAssert a=new SoftAssert();
        a.assertEquals(driver.getTitle(), "Amazon","Sorry..Actual and Expected behaviour not mathcing");
		
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(5000);
		
		List <WebElement> autosuggest=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		autosuggest.get(2).click();
	
		System.out.println("Test case is passed successfully..!");
		
		a.assertAll();
		
		
		
		
		
		
		
		
		
		
	}

	
	
	

}
