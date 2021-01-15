package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends Base{
	
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement topic;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement search;
	
	@FindBy(xpath="//input[@id='low-price']")
	private WebElement lowprice;
	
	@FindBy(xpath="//input[@id='high-price']")
	private WebElement highprice;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement go;

	public WebElement getTopic() {
		return topic;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLowprice() {
		return lowprice;
	}

	public WebElement getHighprice() {
		return highprice;
	}

	public WebElement getGo() {
		return go;
	}

	
	
}
