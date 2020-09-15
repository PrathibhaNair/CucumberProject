package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Base;

public class SearchResultsPage extends Base{

	public SearchResultsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radSearchResult;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(id="cancel")
	private WebElement btnCancel;

	public WebElement getRadSearchResult() {
		return radSearchResult;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void clickSearchResult() {
		click(getRadSearchResult());
	}
	
	public void clickContinue() {
		click(getBtnContinue());
	}
	
}
