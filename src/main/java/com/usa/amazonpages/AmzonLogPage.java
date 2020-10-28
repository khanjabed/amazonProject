package com.usa.amazonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.amazanbasepage.amazanSuperClass;

public class AmzonLogPage extends amazanSuperClass{
	
	public AmzonLogPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[@data-nav-role='signin']")
	private WebElement mouseover;
	
	public WebElement getMouseover() {
		return mouseover;
	}
	
	@FindBy (xpath="(//a[@data-nav-ref='nav_signin']//descendant::span[1]")
	private WebElement clickSignin;
	
	public WebElement getClickSignin() {
		return clickSignin;
	}	
	
	
	
	/*@FindBy(xpath=("//span[contains (text(),'Hello, Sign in')]"))
	private WebElement Signin;

	public WebElement getSignin() {
		return Signin;
	}
	@FindBy(xpath=("(//span[@class='nav-action-inner'])[1]"))
	private WebElement Signinbtn;

	public WebElement getSigninbtn() {
		return Signinbtn;}*/
	

	@FindBy(xpath=("//input[@id='ap_email']"))
	private WebElement EnterEmail;
	//input[@type='email']
	//input[@id='ap_email']
	public WebElement getEnterEmail() {
		return EnterEmail;
	}
	@FindBy(xpath=("//input[@id='continue']"))
	private WebElement ContinueBtn;

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	@FindBy(xpath=("//input[@id='ap_password']"))
	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}
	
	@FindBy(xpath=("//input[@id='signInSubmit']"))
	private WebElement SubmitSignin;

	public WebElement getSubmitSignin() {
		return SubmitSignin;
	}
	
	
	
	

}
