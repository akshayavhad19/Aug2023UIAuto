package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		//browser -- page-- iframe-- shadow dom--element
		//document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
		Thread.sleep(5000);
		driver.switchTo().frame("pact");
		
		String tea_script="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight/2);");
		//typecast html element to selenium webelement
		Thread.sleep(3000);

		WebElement tea= (WebElement)js.executeScript(tea_script);
		tea.sendKeys("Masala Chai");
	}

}
