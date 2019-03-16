package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import frameworkGlobals.BrowserSelection;



public class GetScreenshots extends BrowserSelection {


	/*	public static void GenerateScreenshot(String SSname) throws IOException, InterruptedException
	{	
		
		try
		{
			if("Error" == getDriver().getTitle() || "Server Error" == getDriver().getTitle())
			{
				Thread.sleep(4000);
				File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("SystemLogs\\Screenshots\\"+SSname+".jpeg"));
				System.out.println("Screenshot has been generated for server error and location is  " +SSname);
				
			}
		// It will check whether server error is coming in a page
		if(isTextPresent("Server") || isTextPresent("Page not found") || isTextPresent("Server Error"))
		{
			Thread.sleep(4000);
			File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("SystemLogs\\Screenshots\\"+SSname+".jpeg"));
			System.out.println("Screenshot has been generated for " +SSname);
			
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Everything is working fine");
		}
		
	}
	*/
				
		
	
		
		
	/*	public static boolean isTextPresent(String text)
		{
			try
			{
			 boolean b ;
			 b = getDriver().getPageSource().contains(text);
		        return b;
		    }
		    catch(Exception e)
		    {
		    	System.out.println( text + " ------ not present test case failed");
		    	System.exit(0);
		        return false;
		    }
		  }*/
		
		public static void takeScreenshot(String SSname) throws IOException, InterruptedException{
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			
			File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("SystemLogs\\Screenshots\\"+dateFormat.format(date)+"\\"+SSname+".jpeg"));
			System.out.println("Screenshot has been generated for " +SSname);		    
		}
}
