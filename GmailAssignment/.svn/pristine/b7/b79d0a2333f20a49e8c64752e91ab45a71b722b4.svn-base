package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import interfaces.GlobalComponents;

public class ReadProp {

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
}
