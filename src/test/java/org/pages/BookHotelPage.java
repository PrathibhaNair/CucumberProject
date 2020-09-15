package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;


public class BookHotelPage extends Base{

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCNumber;
	
	@FindBy(id="cc_type")
	private WebElement drpCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement drpCCExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement drpCCExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCCCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	@FindBy(id="cancel")
	private WebElement btnCancel;

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNumber() {
		return txtCCNumber;
	}

	public WebElement getDrpCCType() {
		return drpCCType;
	}

	public WebElement getDrpCCExpMonth() {
		return drpCCExpMonth;
	}

	public WebElement getDrpCCExpYear() {
		return drpCCExpYear;
	}

	public WebElement getTxtCCCvv() {
		return txtCCCvv;
	}
	
	public void bookingDetails(String firstName, String lastName, String billingAddress, String creditCardNo,
			String creditCardType, String expiryMonth, String expiryYear, String cvv) {
		insert(getTxtFirstName(), firstName);
		insert(getTxtLastName(), lastName);
		insert(getTxtAddress(), billingAddress);
		insert(getTxtCCNumber(), creditCardNo);
		selByVisibleText(getDrpCCType(), creditCardType);
		selByVisibleText(getDrpCCExpMonth(), expiryMonth);
		selByVisibleText(getDrpCCExpYear(), expiryYear);
		insert(getTxtCCCvv(), cvv);
	}
	
	public void clickBookNow() {
		click(getBtnBookNow());
	}
}
