package com.usa.amazonsteps;

import org.openqa.selenium.support.PageFactory;

import com.usa.amazanbasepage.amazanSuperClass;
import com.usa.amazonpages.AmzonLogPage;
import com.usa.amazonutility.AmazonUtility;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class AmazonStepDef extends amazanSuperClass {

	AmzonLogPage lp;

	@Given("^user able to open browser$")
	public void user_able_to_open_browser() {
		//lp = PageFactory.initElements(driver, AmzonLogPage.class);
		initialization();
		lp = new AmzonLogPage ();
	}

	@Given("^user navigate to URL \"([^\"]*)\"$")
	public void user_navigate_to_URL(String URL) {
		driver.get(URL);

	}

	@Given("^able to click on sign btn$")
	public void able_to_click_on_sign_btn() throws Exception {
		/*AmazonUtility.actionClick(lp.getSignin(), driver);
		lp.getSigninbtn().click();*/
		
		
		AmazonUtility.Explicitwait(lp.getMouseover(), driver);
		AmazonUtility.actionClick(lp.getMouseover(), driver);
	
		
	}

	@Given("^user able to enter email \"([^\"]*)\"$")
	public void user_able_to_enter_email(String email) {
		AmazonUtility.Explicitwait(lp.getEnterEmail(), driver);
		lp.getEnterEmail().sendKeys(email);
	}

	@Given("^user able to click on continue$")
	public void user_able_to_click_on_continue() {
		AmazonUtility.jsClick(lp.getContinueBtn());
		//lp.getContinueBtn().click();
	}

	@Given("^user able to enter password \"([^\"]*)\"$")
	public void user_able_to_enter_password(String password) {
		lp.getEnterPassword().sendKeys(password);

	}

	@Then("^user able to click on signin btn$")
	public void user_able_to_click_on_signin_btn() {
		lp.getSubmitSignin().click();
	}

	@Then("^user landed in home page and verify title$")
	public void user_landed_in_home_page_and_verify_title() {
		String ActualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		Assert.assertEquals(expectedTitle, ActualTitle);
	}

}
