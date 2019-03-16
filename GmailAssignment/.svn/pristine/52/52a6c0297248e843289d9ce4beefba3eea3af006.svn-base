package frameworkGlobals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import interfaces.DriverActions;
import utilities.JSExecutor;

public class ByCssSelector extends BrowserSelection implements DriverActions {

	@Override
	public void click(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			element.click();
			System.out.println("Clicked Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Clicked Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Click: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
		    throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Click : "+actionInfo+" (cssSelector: "+selector+")");
			
		}
	}

	@Override
	public void selectByIndex(String selector, int index, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			select.selectByIndex(index);
			System.out.println("Selected Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Selected Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Select : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public void selectByValue(String selector, String value, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			select.selectByValue(value);
			System.out.println("Selected Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Selected Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Select : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public void selectByVisibleText(String selector, String text, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			select.selectByVisibleText(text);
			System.out.println("Selected Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Selected Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Select : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public String getClass(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		String className = null;
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			className = element.getAttribute("class");
			System.out.println("Got Class Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Got Class Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get Class: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Class : "+actionInfo+" (cssSelector: "+selector+")");
		}
		return className;
	}

	@Override
	public String getFirstSelectedOption(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		String firstSelectedoption = null;
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			WebElement option = select.getFirstSelectedOption();
			firstSelectedoption = option.getText();	
			System.out.println("Getting Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get : "+actionInfo+" (cssSelector: "+selector+")");
		}
		
		return firstSelectedoption;
	}

	@Override
	public List<String> getOptions(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		List<String> allOptions = new ArrayList<>();
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			Select select = new Select(element);
			new JSExecutor().highlightElement(element);
			List<WebElement> options = select.getOptions();
			for(int i=0; i<options.size(); i++) {
				allOptions.add(options.get(i).getText());
			}
			System.out.println("Getting Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get : "+actionInfo+" (cssSelector: "+selector+")");
		}
		
		return allOptions;
	}

	@Override
	public int getSize(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		int listSize;
		try {
			alerts.acceptAlert();
			/*WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);*/
			List<WebElement> options = getDriver().findElements(By.cssSelector(selector));
			listSize=options.size();
		    System.out.println("Getting Successfully: "+actionInfo);
		    extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
	    	throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Size : "+actionInfo+" (cssSelector: "+selector+")");
		}		
		return listSize;
	}

	@Override
	public String getAttribute(String selector, String attribute, String actionInfo) {
		// TODO Auto-generated method stub
		String attributeValue;
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			attributeValue = element.getAttribute(attribute);
		    System.out.println("Getting Successfully: "+actionInfo);
		    extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Attribute : "+actionInfo+" (cssSelector: "+selector+")");
		}
		
		return attributeValue;
	}

	@Override
	public String getText(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		String textValue;
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			textValue = element.getText();
			System.out.println("Getting Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Text : "+actionInfo+" (cssSelector: "+selector+")");
		}		
		return textValue;
	}

	@Override
	public void setText(String selector, String inputText, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			 element.sendKeys(inputText);	
			System.out.println("Text entered Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Text entered Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to enter text: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to enter text : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public void clearThenSetText(String selector, String inputText, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			element.clear();
			 element.sendKeys(inputText);	
			System.out.println("Text entered Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Text entered Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to enter text: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to enter text : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public String getTagName(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Tag Name Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Tag Name Successfully: "+actionInfo);
			return element.getTagName();
			
		} catch (Exception e) {
			System.out.println("Not able to Get Tag Name Successfully: "+actionInfo);
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Tag Name : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public boolean isDisplayed(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Displayed State Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Displayed State Successfully: "+actionInfo);
			return element.isDisplayed();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Displayed State: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Displayed State : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public boolean isEnabled(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Enabled State Successfully: "+actionInfo+" (IcssSelectorD: "+selector+")");
			extentTest.log(LogStatus.INFO, "Get Enabled State Successfully: "+actionInfo);
			return element.isEnabled();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Enabled State: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Enabled State : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public boolean isSelected(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Selected State Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Selected State Successfully: "+actionInfo);
			return element.isSelected();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Selected State: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Selected State : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public void clear(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			element.clear();
			System.out.println("Cleared Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Cleared Successfully: "+actionInfo);
			
		} catch (Exception e) {
			System.out.println("Not able to Clear: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Clear : "+actionInfo+" (cssSelector: "+selector+")");
		}
	}

	@Override
	public void setMultipleText(String urlPath, String[] selectorArray, String[] textArray, String actionInfo) {
		// TODO Auto-generated method stub
		/**
		 * Make Sure The Text Values are same order as ID values. Also the data Type
		 * should accurate
		 */
		if (!(urlPath == null))
			getDriver().get(urlPath);
		if (selectorArray.length == textArray.length) {
			byte i = 0;
			try {
				for (String st : selectorArray) {
					Thread.sleep(100);
					clearThenSetText(st, textArray[i], actionInfo);
					i++;
				}
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				// TODO: handle exception
			}
		} else {
			System.out.println("Size of selectorArray is not equal to textArray");
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Size of 'selectorArray' is not equal to 'textArray' : "+actionInfo);
		}
	}

	@Override
	public WebElement getElement(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.cssSelector(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Element Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Element Successfully: "+actionInfo);
			return element;
			
		} catch (Exception e) {
			System.out.println("Not able to Get Element: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Element : "+actionInfo+" (cssSelector: "+selector+")");
			
		}
	}

	@Override
	public List<WebElement> getElements(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		List<WebElement> elementList = null;
		try {
			alerts.acceptAlert();
			elementList = getDriver().findElements(By.cssSelector(selector));
			System.out.println("Get Elements Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Element Successfully: "+actionInfo);
			
		} catch (Exception e) {
			System.out.println("Not able to Get Elements: "+actionInfo+" (cssSelector: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Elements : "+actionInfo+" (cssSelector: "+selector+")");
		}
		return elementList;
	}

}
