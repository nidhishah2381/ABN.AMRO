/**
 * 
 */
package com.abn.amro;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

/**
 * @author nidhi.shah
 */
public class StepsBackLog {

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "upload file {0} into {1}")
	public void uploadFileInto(String fileName, String loc) {
		String path = System.getProperty("user.dir");
		new QAFExtendedWebElement(loc).sendKeys(path + "\\resources\\" + fileName);
		// Execute Job
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "close {0} if visible")
	public void closeIfVisible(String loc) {
		QAFExtendedWebElement cookiePopup = new QAFExtendedWebElement(loc);
		if(cookiePopup.isDisplayed()) {
			cookiePopup.click();
			cookiePopup.waitForNotPresent();
		}
	}

}
