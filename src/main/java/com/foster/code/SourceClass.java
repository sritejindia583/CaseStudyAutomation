package com.foster.code;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;


public class SourceClass extends LoggerClass {
		
	public SourceClass() { 
	
	}
	
	public boolean takScreenshot(WebDriver driver) {
		try {			
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(FactorySupport.getScreenshotsPath() + "/" + getCurrentTimestamp() + ".png"));
			return true;
		} catch(WebDriverException exception) {
			exception.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String getCurrentTimestamp() {
		Date dateObject = new Date();
		Timestamp timeStamp = new Timestamp(dateObject.getTime());
		return timeStamp.toString();
	}

	public void readExcelFile() {
		
	}
	
}
	
	