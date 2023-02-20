package com.aiite;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aiite.pro.LoginPageFirst;
import com.project.Baseclass;

public class HomePageexe extends Baseclass  {
	@Before
	public void homepage() {
		driver.get("https://www.cheapair.com/");
		
	}
	@Test
	public void test5() {
		LoginPageFirst obj=new LoginPageFirst();
		
	}
	
	/*
	@Test
	public void test3() throws IOException {
		LoginPageFirst obj=new LoginPageFirst();
		type(obj.getUsername(), "jayaram");
		type(obj.getPassword(), "jayaram@4554");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\JAVA Class notes\\Selenium Class notes\\New folder\\Three.png");
		FileHandler.copy(source, destination);
		obj.getScreenshot();
	    
	}
	
	@Test
	public void test4() throws IOException {
		LoginPageFirst obj=new LoginPageFirst();
		type(obj.getUsername(), "Rajaram");
		type(obj.getPassword(), "Rajaram@4554");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\JAVA Class notes\\Selenium Class notes\\New folder\\Four.png");
		FileHandler.copy(source, destination);
		obj.getScreenshot();
		
	}*/

}
