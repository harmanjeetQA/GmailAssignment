package com.packages.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AssignmentTestHardcoded {
	public static WebDriver driver;

	@BeforeClass
	public void launchBrowser() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:/workspace/EquitySim_Project/BrowserExecutables/chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	
	
	
	
	
	@Test()
	public void TestCase2() throws IOException, InterruptedException{
	 
		
		  String url = "https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=en";
		    driver.get(url);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		    WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		    email_phone.sendKeys("******@gmail.com");
		    driver.findElement(By.id("identifierNext")).click();
		    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		    WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.elementToBeClickable(password));
		    password.sendKeys("testpwd");                     
		   password.sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		    WebElement composeMail= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Compose')]")));
		    composeMail.click();
           driver.findElement(By.xpath("//*[text()='To']/../../..//textarea")).sendKeys("******@gmail.com");
           driver.findElement(By.name("subjectbox")).sendKeys("subject");
           driver.findElement(By.xpath("//*[@class='btC']/td[5]/div[1]/div[1]/div[1]/div[2]")).click();
		    driver.findElement(By.xpath("//div[@id=':r2']")).click();
           driver.findElement(By.xpath("//div[@class='J-M-JJ asg']//input[@type='text']")).sendKeys("Labeltest");
          driver.findElement(By.xpath("//*[@class='J-M-Jz aXjCH']/div[5]/div[1]/div[1]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[contains(text(),'Apply')]")).click();
		  Thread.sleep(3000);
           WebElement sendbutton = driver.findElement(By.xpath("//*[@class='btC']/td[1]/div[1]/div[2]"));
          sendbutton.click();
	      System.out.println("email sent");
	      Thread.sleep(10000);
			  
     WebElement sentMail= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='TN bzz aHS-bnu']/div[2]/span/a")));
    sentMail.click();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
   WebElement elm = driver.findElement(By.xpath("//*[@class='Cp']/div[1]/table/tbody/tr[1]/td[6]/div[1]/div[1]/div[2]/span/span"));
   Actions ac = new Actions(driver);
   ac.moveToElement(elm).click().perform();
   String sentMailsubject=  driver.findElement(By.xpath("//h2[@class='hP']")).getText();
   if (sentMailsubject.equals("subject"))
{
	String sentMailLabel=  driver.findElement(By.xpath("//*[@class='hN']")).getText();
	Assert.assertEquals(sentMailLabel, "Labeltest");
}
   else{
	   System.out.println("Sent email do not appearig in sent list");
	Assert.fail();
}
	}        

	
     @AfterClass()
  	public void exit() {
  		driver.quit(); 
  	}
     
}


