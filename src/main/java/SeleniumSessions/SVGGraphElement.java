package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		Thread.sleep(5000);
		//Page-->iframe-->svg
		
		//*[local-name()='svg']//*[name()='g']//*[name()='g' and @class='region']
		//Total 51 states
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		List<WebElement>stateList= driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g']//*[name()='g' and @class='region']"));
		System.out.println(stateList.size());
		
		Actions act= new Actions(driver);
		for( WebElement e: stateList) {
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String stateName=e.getDomAttribute("id");
			System.out.println(stateName);
			
				if (stateName.contains("georgia")) {
					e.click();
					break;
				}
		}
	}
}
