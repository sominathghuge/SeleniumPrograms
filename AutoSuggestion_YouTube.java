package seleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion_YouTube {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search_query")).sendKeys("Arijit Songs");
		Thread.sleep(3000);
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='ytSearchboxComponentSuggestionsContainer']/div"));
		
		li.get(5).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Best Of Arijit Singh 2024 | Arijit Singh Hits Songs | Arijit Singh Jukebox Songs | Indian Songs")).click();		
		
		
		
		
	}
	

}
