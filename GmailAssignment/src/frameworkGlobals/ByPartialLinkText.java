package frameworkGlobals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import interfaces.DriverActions;
import utilities.JSExecutor;

public class ByPartialLinkText extends BrowserSelection implements DriverActions {

	/**<h1>  click     </h1>
	 * {@code public void click(String selector, String actionInfo)}<br>
	   * This method performs click on the 'selector' element.
	   * PartialLinkText of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector PartialLinkText of element to Click.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void click(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			element.click();
			System.out.println("Clicked Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Clicked Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Click: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
		    throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Click : "+actionInfo+" (PartialLinkText: "+selector+")");
			
		}		
	}
	
	/**<h1>  getClass     </h1>
	 * {@code public String getClass(String selector, String actionInfo)}<br>
	   * This method returns the class name of 'selector' element.
	   * PartialLinkText of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector PartialLinkText of element to Get Class.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return String clasNname of 'selector'.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getClass(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		String className = null;
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			className = element.getAttribute("class");
			System.out.println("Got Class Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Got Class Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get Class: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Class : "+actionInfo+" (PartialLinkText: "+selector+")");
		}
		return className;
	}

	/**<h1>  getSize     </h1>
	 * {@code public int getSize(String selector, String actionInfo)}<br>
	   * This method get size of selector element.
	   * PartialLinkText of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: PartialLinkText of element for which class need to get.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return size value of selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public int getSize(String selector, String actionInfo) {
		int listSize;
		try {
			alerts.acceptAlert();			
			/*WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);*/
			List<WebElement> options = getDriver().findElements(By.partialLinkText(selector));
			listSize=options.size();
		    System.out.println("Getting Successfully: "+actionInfo);
		    extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
	    	throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Size : "+actionInfo+" (PartialLinkText: "+selector+")");
		}		
		return listSize;
	}
	
	/**<h1>  getAttribute     </h1>
	 * {@code public String getAttribute(String selector, String attribute, String actionInfo)}<br>
	   * This method get attribute value of selector element's attribute.
	   * PartialLinkText of elements should be pass as argument selector.
	   * attribute name should be pass as attribute
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: PartialLinkText of element for which class need to get.
	   * @param attribute: name of the attribute whose value need to get
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return value of given attribute of selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getAttribute(String selector, String attribute, String actionInfo) {
		String attributeValue;
		try {
			alerts.acceptAlert();			
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			attributeValue = element.getAttribute(attribute);
		    System.out.println("Getting Successfully: "+actionInfo);
		    extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Attribute : "+actionInfo+" (PartialLinkText: "+selector+")");
		}
		
		return attributeValue;
	}
	
	/**<h1>  getText     </h1>
	 * {@code public String getText(String selector, String actionInfo)}<br>
	   * This method get text of selector element.
	   * PartialLinkText of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: PartialLinkText of element for which class need to get.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return text selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getText(String selector, String actionInfo) {
		String textValue;
		try {
			alerts.acceptAlert();			
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			textValue = element.getText();
			System.out.println("Getting Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Text : "+actionInfo+" (PartialLinkText: "+selector+")");
		}		
		return textValue;
	}

	/**<h1>  getTagName     </h1>
	 * {@code public String getTagName(String selector, String actionInfo)}<br>
	   * This method returns the tag name of 'selector' element.
	   * PartialLinkText of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector PartialLinkText of element to Get tag name.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return String tagName of the 'selector'.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getTagName(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Tag Name Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Tag Name Successfully: "+actionInfo);
			return element.getTagName();
			
		} catch (Exception e) {
			System.out.println("Not able to Get Tag Name Successfully: "+actionInfo);
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Tag Name : "+actionInfo+" (PartialLinkText: "+selector+")");
		}
	}

	/** <h1>  isDisplayed     </h1>
	 * {@code public boolean isDisplayed(String selector, String actionInfo)}<br>
	   * This method returns whether the 'selector' element is displayed or not.
	   * PartialLinkText of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector PartialLinkText of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return True if 'selector' element is displayed otherwise False.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public boolean isDisplayed(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Displayed State Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Displayed State Successfully: "+actionInfo);
			return element.isDisplayed();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Displayed State: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Displayed State : "+actionInfo+" (PartialLinkText: "+selector+")");
		}
	}

	/** <h1>  isEnabled     </h1>
	 * {@code public boolean isEnabled(String selector, String actionInfo)}<br>
	   * This method returns whether the 'selector' element is displayed or not.
	   * PartialLinkText of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector PartialLinkText of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return True if 'selector' element is Enabled otherwise False.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public boolean isEnabled(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Enabled State Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Enabled State Successfully: "+actionInfo);
			return element.isEnabled();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Enabled State: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Enabled State : "+actionInfo+" (PartialLinkText: "+selector+")");
		}
	}

	/** <h1>  getElement     </h1>
	 * {@code public WebElement getElement(String selector, String actionInfo)}<br>
	   * This method returns WebElement of 'selector'.
	   * PartialLinkText of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector PartialLinkText of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return WebElement object.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public WebElement getElement(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			WebElement element = getDriver().findElement(By.partialLinkText(selector));
			new JSExecutor().highlightElement(element);
			System.out.println("Get Element Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Element Successfully: "+actionInfo);
			return element;
		
			//log1.info("");
		} catch (Exception e) {
			System.out.println("Not able to Get Element: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Element : "+actionInfo+" (PartialLinkText: "+selector+")");
			
		}		
	}

	/** <h1>  getElements     </h1>
	 * {@code public List<WebElement> getElements(String selector, String actionInfo)}<br>
	   * This method returns List of WebElement of 'selector'.
	   * PartialLinkText of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector PartialLinkText of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return List<WebElement> (list of WebElement objects).
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public List<WebElement> getElements(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		List<WebElement> elementList = null;
		try {
			alerts.acceptAlert();
			elementList = getDriver().findElements(By.partialLinkText(selector));
			System.out.println("Get Elements Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Element Successfully: "+actionInfo);
			
		} catch (Exception e) {
			System.out.println("Not able to Get Elements: "+actionInfo+" (PartialLinkText: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Elements : "+actionInfo+" (PartialLinkText: "+selector+")");
		}
		return elementList;
	}

	
	/** <h1>  This is Empty Method     </h1>
	 *@deprecated
	 */
	@Override
	public void selectByIndex(String selector, int index, String actionInfo) {
		// TODO Auto-generated method stub
		
	}
	
	/** <h1>  This is Empty Method     </h1>
	 *@deprecated
	 */

	@Override
	public void selectByValue(String selector, String value, String actionInfo) {
		// TODO Auto-generated method stub
		
	}
	
	/** <h1>  This is Empty Method     </h1>
	 *@deprecated
	 */

	@Override
	public void selectByVisibleText(String selector, String text, String actionInfo) {
		// TODO Auto-generated method stub
		
	}
	
	/** <h1>  This is Empty Method     </h1>
	 *@deprecated
	 */

	@Override
	public String getFirstSelectedOption(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/** <h1>  This is Empty Method     </h1>
	 *@deprecated
	 */

	@Override
	public List<String> getOptions(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/** <h1>  This is Empty Method     </h1>
	 *@deprecated
	 */

	@Override
	public void setText(String selector, String inputText, String actionInfo) {
		// TODO Auto-generated method stub
		
	}
	
	/** <h1>  This is Empty Method     </h1>
	 *@deprecated
	 */

	@Override
	public void clearThenSetText(String selector, String inputText, String actionInfo) {
		// TODO Auto-generated method stub
		
	}
	
	/** <h1>  This is Empty Method     </h1>
	 * @deprecated
	 */

	@Override
	public void clear(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		
	}
	
	/** <h1>  This is Empty Method     </h1>
	 *  @deprecated
	 */

	@Override
	public void setMultipleText(String urlPath, String[] selectorArray, String[] textArray, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	
	/** <h1>  This is Empty Method     </h1>
	 *  @deprecated
	 */
	@Override
	public boolean isSelected(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}
