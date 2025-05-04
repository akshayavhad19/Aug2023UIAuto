package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecutorConcept {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//interface to excute the JS on the browser
		//RemoteWebDriver implements JavaScriptExecutor
		
		//Menthod--> executeScript(script) we will give js script and call the method
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String pageTitle=js.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		String url= jsUtil.getURLByJs();
		System.out.println(url);
		
	}

}
