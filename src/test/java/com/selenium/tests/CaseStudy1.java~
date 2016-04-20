package com.selenium.tests;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.foster.code.*;

public class CaseStudy1 extends FactorySupport {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		createwebDriver();
		setBaseUrl("http://newtours.demoaut.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		shutdownWebDriver();
	}

	@Before
	public void setUp() throws Exception {
		log("###############################################################################");
		log("'-------------------------------------------------------------------------------");
		log("' Case Study: Case Study 1");
		log("' Script Name: TS_BookFlight");
		log("' Brief Functional Description: Book a return Journey");
		log("' Created On: DD-MMM-YYYY");
		log("' Created By: Enterprise ID");
		log("' Comments/Remmark: ");
		log("'-------------------------------------------------------------------------------");
		log("'###############################################################################");
		
		SimpleDateFormat simpleDataFormat;
		simpleDataFormat = new SimpleDateFormat("yyyy-MM-dd");
		String workingDirectory = System.getProperty("user.dir") + "/results";
		String currentDatestamp = simpleDataFormat.format(new Date());		
		
		try {
			File newDirectory = new File(workingDirectory + "/" + currentDatestamp 
					+ " - " + (new Random()).nextInt(5555));
			if(!newDirectory.exists()) 
				{
					newDirectory.mkdirs();
					System.out.println(newDirectory.getPath());
				} else {
					System.out.println("File already exists " + newDirectory.getPath());
				}
			setScreenshotsPath(newDirectory.getPath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to creater results older");
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCase_BookAReturnJourney() {
		
		try {
			log("Launch the browser with url");
			driver.get(getBaseUrl());
			
			log("maximize the browser size");
			driver.manage().window().maximize();
			
			log("Current Page title is : " + driver.getTitle());
			log("Current Page Url is : " + driver.getCurrentUrl());
			log("************************************************");
			
			takScreenshot(driver);
			
			log("Waiting for username and password to load");
			driverWait(dataElements.getTxtUsername());
			driverWait(dataElements.getPwdPassword());
			
			Assert.assertTrue("UserName field is not present is not present", 
					dataElements.getTxtUsername().isDisplayed());
			log("UserName field is present");
			
			Assert.assertTrue("Password field is not present is not present", 
					dataElements.getPwdPassword().isDisplayed());
			log("Password field is present");
			
			log("Populate username: mercury");
			dataElements.getTxtUsername().sendKeys("mercury");
			
			log("Populate password: mercury");
			dataElements.getPwdPassword().sendKeys("mercury");
			
			takScreenshot(driver);
			
			log("Clicking on Sign-in button");
			dataElements.getBtnSignIn().submit();
			
			log("************************************************");
			
			takScreenshot(driver);
			
			log("Current Page title is : " + driver.getTitle());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log(e.getLocalizedMessage());
		}
		}

}
