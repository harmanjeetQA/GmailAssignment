package com.packages.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepository.GmailElements;


public class AssignmentTest  extends BrowserSelection implements GmailElements {
	@BeforeClass
	public void beforeTest() throws InterruptedException{
		getDriver().get(URL);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
       }
	

	@Test(priority = 1, enabled=true)
	public void GmailTestCase() throws InterruptedException{
		extentTest = extentReport.startTest("TC_Regression_010", "Verify Student should not able to loginStudent with Invalid username");
        byXpath.setText(xpath_Username, value_Username, "Entered email address for login");		
		byId.click(id_NextButton1, "Clicked on next button to move to enter password page");
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        byXpath.setText(xpath_Password, value_Password, "Entered password for login");		
		
        WebElement password = getDriver().findElement(By.xpath(xpath_Password));
	    WebDriverWait wait = new WebDriverWait(getDriver(), 30);
	    wait.until(ExpectedConditions.elementToBeClickable(password));
	    password.sendKeys(value_Password);                     
	     password.sendKeys(Keys.ENTER);
		 getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		byXpath.click(xpath_ComposeMail, "Clicked on compose new mail button");
	    byXpath.setText(xpath_ToRecipient, value_ToRecipient, "Entered recipient email address");		
	    String subjectText = "Sub" + utility.uniqueString();
		byName.setText(name_SubjectTextbox, subjectText, "Entered subject");
		byXpath.click(xpath_MoreIcon, "Clicked on more icon"); 
		byXpath.click(xpath_AddLabelOption, "Clicked on labels option to add a label"); 
	    byXpath.setText(xpath_EnterLabelNameToAdd, value_EnterLabelNameToAdd, "Entered label name");		
		byXpath.click(xpath_SelectLabelCheckbox, "Clicked on labels option to add a label"); 
        Thread.sleep(3000);
		byXpath.click(xpath_ApplyLabel, "Clicked on apply label"); 
        Thread.sleep(3000);
        WebElement sendbutton = getDriver().findElement(By.xpath(xpath_SendEmailButton));
        sendbutton.click();
	    System.out.println("email sent");
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			  
         WebElement sentMail= wait.until(ExpectedConditions.
        		 visibilityOfElementLocated(By.xpath(xpath_SentFolder)));
         sentMail.click();
         getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
         
         
WebElement elm = getDriver().findElement(By.xpath(xpath_OpenSentMail));
Actions ac = new Actions(getDriver());
ac.moveToElement(elm).click().perform();
String sentMailsubject=byXpath.getText(xpath_SentMailSubject, "get sent mail subject");
if (sentMailsubject.equals(subjectText))
{
	String sentMailLabel=byXpath.getText(xpath_SentMailLabel, "get sent mail label");
	Assert.assertEquals(sentMailLabel, value_EnterLabelNameToAdd);
}
else{
	   System.out.println("Sent email do not appearig in sent list");
	Assert.fail();
	}
	
	
	}	
	
	@AfterClass(enabled = true)
	public void exit()
	{
		getDriver().quit();
	}
	
}
