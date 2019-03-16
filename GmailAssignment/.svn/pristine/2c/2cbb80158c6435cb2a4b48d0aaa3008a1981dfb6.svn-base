package utilities;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import frameworkGlobals.BrowserSelection;

public class Alerts extends BrowserSelection {

	public boolean isAlertPresent() {
		boolean flag = false;
		try {
			// Check the presence of alert
			getDriver().switchTo().alert();
			// Alert present; set the flag
			flag = true;
		} catch (NoAlertPresentException e) {
			// Alert not found
			System.out.println("Alert not found");
			//e.printStackTrace();
		}
		return flag;
	}

	public boolean acceptAlert() throws InterruptedException {
		boolean flag = false;
		try {
			// Check the presence of alert
			Alert alert = getDriver().switchTo().alert();
			// Alert present; set the flag
			flag = true;
			// Accept the alert
			alert.accept();
			System.out.println("Alert accepted");
		} catch (NoAlertPresentException e) {
			// Alert not found
			System.out.println("Alert not found");
		//	e.printStackTrace();
		}
		return flag;
	}

	public boolean rejectAlert() throws InterruptedException, IOException {
		boolean flag = false;
		try {
			// Check the presence of alert
			Alert alert = getDriver().switchTo().alert();
			// Alert present; set the flag
			flag = true;
			alert.dismiss();
			System.out.println("Alert rejected");
		} catch (NoAlertPresentException e) {
			// Alert not present
			System.out.println("Alert not found");
			e.printStackTrace();
		}
		return flag;
	}

	public String getAlertText() {
		String alertText = null;
		try {
			// Check the presence of alert
			Alert alert = getDriver().switchTo().alert();
			// Alert present; get alert text
			alertText = alert.getText();

		} catch (NoAlertPresentException e) {
			// Alert not present
			System.out.println("Alert not found");
			e.printStackTrace();
		}
		return alertText;
	}

}