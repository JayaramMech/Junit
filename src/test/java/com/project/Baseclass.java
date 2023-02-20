package com.project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	@BeforeClass
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	    public static void type(WebElement element,String data) {
        element.sendKeys(data);

}
	    public static void click(WebElement element) {
	   	element.click();
	}
 
	//public static void Screenshot() throws IOException {
		
	//}

}
