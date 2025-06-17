package SeleniumSessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandle {
	public static void main(String[] args) {
		//SVG: Scalable Vector Graphics
		//can not use css selector for svg
		//only xpth is applicable: special xpath syntex
		//Important property == local-name()='svg'
		//button[@type='submit']//*[local-name()='svg' and @fill='none']
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Windows");
		driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg' and @fill='none']")).click();
	}
	
	
	
}
