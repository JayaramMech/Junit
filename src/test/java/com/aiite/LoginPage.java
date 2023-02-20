package com.aiite;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.aiite.pro.LoginPageFirst;
import com.project.Baseclass;

public class LoginPage extends Baseclass {
	
	@Before
	public void homepage() {
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test1() throws IOException {
		LoginPageFirst obj=new LoginPageFirst();
		type(obj.getUsername(), "Vadivel");
		type(obj.getPassword(), "Vadivel@4554");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\JAVA Class notes\\Selenium Class notes\\New folder\\one.png");
		FileHandler.copy(source, destination);
		obj.getScreenshot();
	}
	
	@Test
	public void test2() throws IOException {
		LoginPageFirst obj=new LoginPageFirst();
		type(obj.getUsername(), "Surya");
		type(obj.getPassword(), "Surya@4554");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\JAVA Class notes\\Selenium Class notes\\New folder\\Two.png");
		FileHandler.copy(source, destination);
		obj.getScreenshot();
		
	}

}


