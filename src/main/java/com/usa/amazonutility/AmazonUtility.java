package com.usa.amazonutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Level;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.usa.amazanbasepage.amazanSuperClass;

import junit.framework.Assert;

public class AmazonUtility extends amazanSuperClass {

	public static void actionClick(WebElement element, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.click().build().perform();

	}

	public static void RightClick(WebElement element, WebDriver driver) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();

	}

	public static void jsClick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public static WebElement Explicitwait(WebElement waitelement, WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(waitelement));
		return element;

	}

	public static void robotClick() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void handleNewTab(int i) {
		String parent = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		ArrayList<String> NewTab = new ArrayList<>(allWindowHandles);
		driver.switchTo().window(NewTab.get(i));

	}
//will open only next window
	public static void handleChildNext(String window) {
		//String parent = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iter = allWindowHandles.iterator();
		int size = allWindowHandles.size();
		String child = null;
		for (int i = 0; i < size; i++) {
			child = iter.next();
			
		}

		driver.switchTo().window(window);

	}
	
	public static void scrollToView (WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	public static void scrollDown () {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
}
	
	public static void Verify_Page_Title(String expected) {
		String actual_Title= driver.getTitle();
		Assert.assertEquals(expected, actual_Title);
		System.out.println(actual_Title);
	}
	public static Actions getAction() {
		Actions action = new Actions (driver);
		return action;
	}
	public static void waitThenClick(WebElement element, WebDriver driver) {
		try {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
		if (element.isDisplayed() && element.isEnabled()) {
		getAction().moveToElement(element);
		getAction().click(element).build().perform();
		}
		} catch (TimeoutException toe) {
		logger.log(Level.WARN, " Interrupted! ", toe);
		Thread.currentThread().interrupt();
		} catch (Exception e) {
		logger.log(Level.WARN, "Interrup ted!", e);
		Thread.currentThread().interrupt();
		}
		
		
	
	}}
