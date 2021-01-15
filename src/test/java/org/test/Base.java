package org.test;

import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	public static void launchBrowser(String browsername) {
		
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browsername.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}
	
	public static void close() {
		driver.quit();
	}
	
	public void startTime() {
		Date st = new Date();
		System.out.println(st);
	}
	
	public void endTime() {
		Date et = new Date();
		System.out.println(et);
	}
	
	public void launchurl(String url) {
		driver.get(url);
	}
	
	public void fill(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void getattribute(WebElement element) {
		String txt = element.getAttribute("value");
		System.out.println(txt);
	}
	
	public void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public void all() {
		List<WebElement> Camera = driver.findElements(By.xpath("//span[contains(text(),'Camera')]"));
		
		for (WebElement webElement : Camera) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}
}
