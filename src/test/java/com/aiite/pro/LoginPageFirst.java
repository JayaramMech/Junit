package com.aiite.pro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.Baseclass;

public class LoginPageFirst extends Baseclass {
	public LoginPageFirst() {
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(id="email")
	private WebElement Username;
	
	@FindBy(id="pass")
	private WebElement Password;*/
	

	public WebElement getSubmit() {
	return getSubmit();
}

	/*public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}*/
	
	/*@FindBy(xpath="//span[contains(text(),'Sign In')][1]")
	private WebElement submit;*/
	
	WebElement point=driver.findElement(By.xpath("//img[@alt='Home']"));
	Actions acc=new Actions(driver);
	acc.moveToElement(point).perform();
	
	/*private WebElement Screenshot;


	public WebElement getScreenshot() {
		return Screenshot;
	}

	public void setScreenshot(WebElement screenshot) {
		Screenshot = screenshot;
	}*/

}


