package com.usa.amazonpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.amazanbasepage.amazanSuperClass;
import com.usa.amazonutility.AmazonUtility;

public class DealPageLogin extends amazanSuperClass{
	public DealPageLogin () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@class='nav-a  '])[4]")
	private WebElement ClickTodays;
	public WebElement getClickTodays() {
		return ClickTodays;
		////a[@href='/gp/goldbox?ref_=nav_cs_gb']
		//div[@id='nav-xshop-container']//descendant::a[5]
		//div[@id='nav-xshop-container']//a[5]
		//(//a[@class='nav-a  '])[5]
		//div[@id='nav-xshop-container']//descendant::a[@class='nav-a  ']
		
	}
	
	public static void todaysDeal() {
		
		List<WebElement>today = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		for(int j=0;j<today.size();j++) {
			
			WebElement elm= today.get(j);
			String AllMatch=elm.getText();
			if(AllMatch.equalsIgnoreCase("Today's Deals")) {
				AmazonUtility.RightClick(elm, driver);
				break;
							
			} 	

		}
		
	}
	
	@FindBy(xpath="(//div[@class='tile aok-inline-block'])[4]")
	private WebElement clickonEletric;
	public WebElement getClickonEletric() {
		return clickonEletric;
		//div[@class='a-section tileOverlay selected']
		//(//span[contains (text(),'Electronics')])[1]
		//(//div[@class='tile aok-inline-block'])[4]
	}
	
public static void clickElectronic() {
		
		List<WebElement>today = driver.findElements(By.xpath("//span[@class='a-color-base gb-size-small faceoutText aok-block']"));
		for(int j=0;j<today.size();j++) {
			
			WebElement elm= today.get(j);
			String AllMatch=elm.getText();
			if(AllMatch.equalsIgnoreCase("Electronics")) {
				//AmazonUtility.jsClick(elm);
				elm.click();
				break;
							
			} 	}

		}
	
	public static void selectSeventhP() {
		List<WebElement>seven=driver.findElements(By.xpath("//div[@class='a-row a-spacing-medium']"));
			for(int i=0;i<seven.size();i++) {
				if(i>7) {
					WebElement element=seven.get(i);
					element.click();
					break;
				}
			}	
			
	}
	
	/*public static void clickAddToCart() {
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='a-button-stack']"));
		for(int i=0;i<list.size();i++) {
			if(i>0) {
				//driver.switchTo().frame(i);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				//span[@id='submit.add-to-cart']
				//(//body[@class='a-m-us a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_preload_261698-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate']//descendant::iframe)")
			}}
	}*/
	
public static void clickAddtocart() {
		
		List<WebElement>addtocart = driver.findElements(By.xpath("//div[@class='a-button-stack']"));
		for(int j=0;j<addtocart.size();j++) {
			
			WebElement elm= addtocart.get(j);
			String AllMatch=elm.getText();
			if(AllMatch.equalsIgnoreCase("Add to Cart")) {
				//AmazonUtility.jsClick(elm);
				elm.click();
				break;
							
			} 	}

		}
	
	
	@FindBy(xpath="//div[@id='soldByThirdPartyRelocate_feature_div']")
	private WebElement addToCart;
	public WebElement getAddToCart() {
		return addToCart;
		//div[@id='soldByThirdPartyRelocate_feature_div']
		//div[@class='a-button-stack']
		//div[@id='addToCart_feature_div']
	}
	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	private WebElement clickProceed;
	public WebElement getClickProceed() {
		return clickProceed;
	}
	
	public static void clickProceedbtn() {
		List<WebElement> proceedbtn = driver.findElements(By.xpath("//span[@class='a-button-inner']"));
		for(int k=0;k<proceedbtn.size();k++) {
			WebElement elm = proceedbtn.get(k);
			String allmatch = elm.getText();
		if (allmatch.equalsIgnoreCase("Proceed to checkout (1 item)")) {
			elm.click();
			break;
		}
		}
	}
	
	

}
