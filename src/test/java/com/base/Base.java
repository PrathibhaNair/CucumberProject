package com.base;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	static Actions a;
	static Select s;
	static Robot r;
	static JavascriptExecutor jk;
	static Alert al;

	public static WebDriver launchBrowser() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Prathibha\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			driver = new ChromeDriver();
		}
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void getUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void getTitle() {
		System.out.println(driver.getTitle());
	}

	public static void insert(WebElement e, String keys) {
		e.sendKeys(keys);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}

	public static String getAttribute(WebElement e, String attName) {
		String str = e.getAttribute(attName);
		return str;
	}

	public static void moveTo(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}

	public static void dblClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	public static void contClick(WebElement element) {
		a.contextClick(element).perform();
	}

	public static void keyUp(WebElement element, String key) {
		a.keyUp(element, key).perform();
	}

	public static void keyDown(WebElement element, String key) {
		a.keyDown(element, key).perform();
	}

	public static void keyPress(int key) throws AWTException {
		r = new Robot();
		r.keyPress(key);

	}

	public static void keyRelease(int key) throws AWTException {
		r = new Robot();
		r.keyRelease(key);

	}

	public static void execScript(String script, WebElement element) {
		jk.executeScript(script, element);
	}

	public static void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void dismissAlert() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void promptAlertAccept(String text) {
		al = driver.switchTo().alert();
		al.sendKeys(text);
		al.accept();
	}

	public static void promptAlertDismiss(String text) {
		al = driver.switchTo().alert();
		al.sendKeys(text);
		al.dismiss();
	}

	public static void getCssVal(WebElement element, String value) {
		String val = element.getCssValue(value);
		System.out.println(val);
	}

	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameById(String id) {
		driver.switchTo().frame(id);
	}

	public static void frameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void window(String str) {
		driver.switchTo().window(str);
	}

	public static void deselByIndex(WebElement element, int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void deselByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deselByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void selByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	public static void selByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void driverClose() {
		driver.close();
	}

	public static void driverQuit() {
		driver.quit();
	}

}
