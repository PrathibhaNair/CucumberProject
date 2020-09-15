package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class BookingConfirm extends Base {

	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement OrderNo;
	
	@FindBy(id="my_itinerary")
	private WebElement btnMyItinerary;

	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}

	public WebElement getOrderNo() {
		return OrderNo;
	}

	public String getAttributeOrderId() {
		String orderValue = getOrderNo().getAttribute("value");
		System.out.println();
		System.out.println("Order ID: " + orderValue);
		return orderValue;
	}
	
	public void clickMyItinerary() {
		click(getBtnMyItinerary());
	}
}
