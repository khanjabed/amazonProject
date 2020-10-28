package com.usa.dealsteps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.usa.amazanbasepage.amazanSuperClass;
import com.usa.amazonpages.DealPageLogin;
import com.usa.amazonutility.AmazonUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AdealSteps extends amazanSuperClass {
	DealPageLogin dl;

	@Given("^user able to open browser$")
	public void user_able_to_open_browser() {
		dl = new DealPageLogin();
		initialization();

	}

	@Given("^user navigate to URL \"([^\"]*)\"$")
	public void user_navigate_to_URL(String URL) throws Exception {
		driver.get(URL);
		Thread.sleep(5000);

	}

	@Given("^user able to click on todays deal$")
	public void user_able_to_click_on_todays_deal() throws Exception {

		// dl.getClickTodays().click();
		// List<WebElement> li= driver.findElements(By.xpath("//a[@class='nav-a ']"));
		// li.get(4).click();
		// dl.getClickTodays().click();
		// driver.findElement(By.xpath("(//a[@class='nav-a '])[5]")).click();
		// dl.todaysDeal();
		// Robot r = new Robot();
		// driver.findElement(By.xpath("//div[@id='nav-xshop-container']//descendant::a[5]"));
		// r.mousePress(InputEvent.BUTTON3_MASK);
		// r.mouseRelease(InputEvent.BUTTON3_MASK);
		dl.todaysDeal();
		AmazonUtility.robotClick();
		Thread.sleep(2000);
		// AmazonUtility.handleChildNext("child");
		AmazonUtility.handleNewTab(1);
		// AmazonUtility.handleNewTab(0);

	}

	/*
	 * @Given("^user able to right click to open new window on todays deal$") public
	 * void user_able_to_right_click_to_open_new_window_on_todays_deal() throws
	 * Exception { AmazonUtility.RightClick(dl.getClickTodays(), driver);
	 * //AmazonUtility.robotClick(); //dl.getClickTodays().click();
	 * //Thread.sleep(3000); //AmazonUtility.Explicitwait(dl.getClickTodays(),
	 * driver);
	 * 
	 * }
	 */

	@Given("^user able to click on electronics$")
	public void user_able_to_click_on_electronics() throws Exception {

		AmazonUtility.scrollToView(driver.findElement(By.xpath("(//div[@class='tile aok-inline-block'])[4]")));

		// dl.clickElectronic();
		// AmazonUtility.scrollDown();

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; WebElement
		 * element=driver.findElement(By.
		 * xpath("(//div[@class='tile aok-inline-block'])[4]"));
		 * js.executeScript("arguments[0].scrollIntoView(true);", element);
		 * Thread.sleep(3000);
		 */
		dl.clickElectronic();
	}

	@When("^user able to select the (\\d+)th product$")
	public void user_able_to_select_the_th_product(int arg1) {
		
		dl.selectSeventhP();

	}

	@When("^user able to click on add to cart$")
	public void user_able_to_click_on_add_to_cart() throws Exception {
		//AmazonUtility.Explicitwait(dl.getAddToCart(), driver);
		//dl.getAddToCart().click();
		//AmazonUtility.jsClick(dl.getAddToCart());
		/*List<WebElement> list=driver.findElements(By.xpath("(//body[@class='a-m-us a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_preload_261698-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate']//descendant::iframe)"));
	for(int i=0;i<list.size();i++) {
		if(i>0) {
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			
		}}*/
		//driver.switchTo().frame(10);
		//Thread.sleep(3000);
		dl.clickAddtocart();
	}
		
	

	@Then("^user able to click on proceed to checkout$")
	public void user_able_to_click_on_proceed_to_checkout() {
		dl.clickProceedbtn();
		
		/*String my_title= driver.getTitle();
		String expected_title="Amazon.com Shopping Cart";
		Assert.assertEquals(expected_title, my_title);*/
	   
		
	}
	
	@Then("^user able to verify page title$")
	public void user_able_to_verify_page_title() {
		/*String my_title= driver.getTitle();
		String expected_title="Amazon Sign-In";
		Assert.assertEquals(expected_title, my_title);
		System.out.println("Test completed");*/
		AmazonUtility.Verify_Page_Title("Amazon Sign-In");
	   
	}


}
