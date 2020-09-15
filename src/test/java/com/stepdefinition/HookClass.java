package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends Base{

	@Before
	public void beforeScenario() {
		//System.out.println("Before scenario");
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
		maximizeWindow();
	}
	
	@After
	public void afterScenario(Scenario sc) {
		//System.out.println("After scenario");
		TakesScreenshot tk = (TakesScreenshot)driver;
		byte[] b = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(b, "img/png");
	}
}
