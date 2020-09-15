package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Base;

public class RegistrationPage extends Base {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "re_password")
	private WebElement txtConfirmPassword;

	@FindBy(id = "full_name")
	private WebElement txtFullName;

	@FindBy(id = "email_add")
	private WebElement txtEmail;

	@FindBy(id = "captcha-form")
	private WebElement txtCaptcha;

	@FindBy(id = "tnc_box")
	private WebElement chkTermsAndAgreements;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	@FindBy(id = "Reset")
	private WebElement btnReset;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public WebElement getTxtFullName() {
		return txtFullName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtCaptcha() {
		return txtCaptcha;
	}

	public WebElement getChkTermsAndAgreements() {
		return chkTermsAndAgreements;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

}
