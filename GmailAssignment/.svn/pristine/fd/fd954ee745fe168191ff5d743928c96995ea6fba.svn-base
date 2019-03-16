package interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.pdfbox.PDFReader;

import frameworkGlobals.*;
import utilities.Alerts;
import utilities.SetLogs;
import utilities.Utility;
public interface ClassObject {
	
	public BrowserSelection browserSelection = new BrowserSelection();
	public ByClassName byClassName=new ByClassName();
	public ByCssSelector byCssSelector=new ByCssSelector();
	public ById byId = new ById();
	public ByLinkText byLinkText=new ByLinkText();
	public ByName byName=new ByName();
	public ByPartialLinkText byPartialLinkText=new ByPartialLinkText();
	public ByXpath byXpath=new ByXpath();
	public Alerts alerts = new Alerts();
	public SetLogs setLogs = new SetLogs();
	public Utility utility=new Utility();
	public PDFReader pdfReader = new PDFReader();
	public static String extentDate = new SimpleDateFormat("dd_MM_yyyy").format(new Date());
	
	
//--------------------------------get current project name--------------------------------------
	
	public int indexDir = System.getProperty("user.dir").lastIndexOf('\\');
	public String currentProjectName=System.getProperty("user.dir").substring(indexDir +1);	
//--------------------------------connection----------------------------------------------------	
	public String hostUserPswd="jdbc:sqlserver://10.8.18.112\\MSSQLSERVER2;user=automation;password=ind#123;database=testingqa";
	
	
}
