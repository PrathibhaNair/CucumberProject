package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class BookedItineraryPage extends Base{
	
	public BookedItineraryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtSearchOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement btnGo;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement chkSelectedBooking;
	
	@FindBy(name="cancelall")
	private WebElement btnCancelSelected;

	public WebElement getTxtSearchOrderId() {
		return txtSearchOrderId;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getChkSelectedBooking() {
		return chkSelectedBooking;
	}

	public WebElement getBtnCancelSelected() {
		return btnCancelSelected;
	}
	
	public void cancel(String orderId) {
		insert(getTxtSearchOrderId(), orderId);
		click(getBtnGo());
		click(getChkSelectedBooking());
		click(getBtnCancelSelected());
	}

}
