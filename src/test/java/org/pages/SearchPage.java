package org.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Base;

public class SearchPage extends Base {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement drpLocation;

	@FindBy(id = "hotels")
	private WebElement drpHotels;

	@FindBy(id = "room_type")
	private WebElement drpRoomType;

	@FindBy(id = "room_nos")
	private WebElement drpRoomNos;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement drpAdultRoom;

	@FindBy(id = "child_room")
	private WebElement drpChildrenRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	@FindBy(id = "Reset")
	private WebElement btnReset;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement linkBookedItinerary;

	public WebElement getDrpLocation() {
		return drpLocation;
	}

	public WebElement getDrpHotels() {
		return drpHotels;
	}

	public WebElement getDrpRoomType() {
		return drpRoomType;
	}

	public WebElement getDrpRoomNos() {
		return drpRoomNos;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getDrpAdultRoom() {
		return drpAdultRoom;
	}

	public WebElement getDrpChildrenRoom() {
		return drpChildrenRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

	public WebElement getLinkBookedItinerary() {
		return linkBookedItinerary;
	}

	public void searchHotels(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		selByVisibleText(getDrpLocation(), location);
		selByVisibleText(getDrpHotels(), hotels);
		selByVisibleText(getDrpRoomType(), roomType);
		selByVisibleText(getDrpRoomNos(), noOfRooms);
		insert(getTxtCheckInDate(), checkInDate);
		insert(getTxtCheckOutDate(), checkOutDate);
		selByValue(getDrpAdultRoom(), adultsPerRoom);
		selByValue(getDrpChildrenRoom(), childrenPerRoom);
	}

	public void searchClick() {
		click(getBtnSearch());
	}

	public void clickLinkBookedItinerary() {
		click(getLinkBookedItinerary());
	}

}
