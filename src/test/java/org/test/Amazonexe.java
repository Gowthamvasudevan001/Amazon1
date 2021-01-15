package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazonexe extends Base{

	@BeforeClass
	public static void laun(){
		launchBrowser("chrome");
	}
	
	@AfterClass
	public static void clo() {
		close();
	}
	
	@BeforeMethod
	public void start() {
		startTime();
	}
	
	@AfterMethod
	public void end() {
		endTime();
	}
	
	@Test
	public void testcase1() {
		
		AmazonPojo a = new AmazonPojo();
		
		launchurl("https://www.amazon.in/");
		
		fill(a.getTopic(), "camera");
		
		click(a.getSearch());
		
		fill(a.getLowprice(), "50000");
		
		fill(a.getHighprice(), "100000");
		
		click(a.getGo());
		
		all();
	}
}
