package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import interfaces.GlobalComponents;

public class ReadWriteProp {

	public static void main(String[] args) throws IOException {
		ReadGlobalData("selectedBrowser");
	}
	
	public static String ReadGlobalData(String varName) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(GlobalComponents.globalData);
		prop.load(file);
		String varname1 = prop.getProperty(varName);
		return varname1;
	}
	
	public static void writeDataInProp(String varName, String value) throws IOException {
		try{
		Properties prop = new Properties();
		FileOutputStream file = new FileOutputStream(GlobalComponents.propertyFile);
		prop.setProperty(varName, value);
		prop.store(file, null);
		file.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
