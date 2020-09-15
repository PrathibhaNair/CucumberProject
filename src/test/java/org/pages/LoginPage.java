package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Base;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String userName, String password) {
		insert(getTxtUsername(), userName);
		insert(getTxtPassword(), password);
	}
	
	public void loginClick() {
		click(getBtnLogin());
	}

}
