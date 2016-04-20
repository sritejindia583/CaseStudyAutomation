package com.foster.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FactorySupport extends SourceClass {
	protected static WebDriver driver;
	protected static WebDriverWait webDriverWait;
	protected static String baseUrl;
	protected static DataMapping dataElements;
	protected static String screenshotsPath;
	
	public static String getBaseUrl() {
		return baseUrl;
	}
	
	public static void setBaseUrl(String baseUrl) {
		FactorySupport.baseUrl = baseUrl;
	}
	
	public static void setScreenshotsPath(String screenshotsPath) {
		FactorySupport.screenshotsPath = screenshotsPath;
	}
	
	public static String getScreenshotsPath() {
		return screenshotsPath;
	}
	
	public FactorySupport() {
	}

	protected static void createwebDriver() {
		driver = new FirefoxDriver();
		webDriverWait = new WebDriverWait(driver, 10);
		dataElements = new DataMapping(driver);
	}
	
	protected static void createWebDriver(String browser) {
		// Add Path to chrome driver to use this piece of code
		driver = new ChromeDriver();
	}
	
	protected static void shutdownWebDriver() {
		driver.quit();
	}
	
	protected static void driverWait(WebElement element) {
		WebElement waitElement = webDriverWait
				.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
