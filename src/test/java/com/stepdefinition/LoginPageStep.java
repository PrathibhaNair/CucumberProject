package com.stepdefinition;

import org.pages.SearchPage;
import org.pages.SearchResultsPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pages.BookHotelPage;
import org.pages.BookedItineraryPage;
import org.pages.BookingConfirm;
import org.pages.LoginPage;

import com.base.Base;
import com.manager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends Base {
	
	PageObjectManager pageObjectManager;
	LoginPage loginPage;
	SearchPage search;
	SearchResultsPage searchResults;
	BookHotelPage bookHotelPage;
	BookingConfirm bookingConfirmPage;
	BookedItineraryPage bookedItineraryPage;
	String orderId;

	@Given("User is on the Adactin Hotel page")
	public void user_is_on_the_Adactin_Hotel_page() {
		
		
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String userName, String password) {
		pageObjectManager = PageObjectManager.getInstance();
		loginPage = pageObjectManager.getLoginPage();
		//loginPage = new LoginPage();
		loginPage.login(userName, password);
	}

	@When("User should click on the login button")
	public void user_should_click_on_the_login_button() {
		loginPage.loginClick();
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {

	}

	@When("User should enter {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_should_enter(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {

		//search = new SearchPage();
		search = pageObjectManager.getSearchPage();
		search.searchHotels(location, hotels, roomType, noOfRooms, checkInDate, checkOutDate, adultsPerRoom, childrenPerRoom);

	}

	@When("User should click on the search button")
	public void user_should_click_on_the_search_button() {
		search.searchClick();
	}

	@Then("User should be displayed the available hotels")
	public void user_should_be_displayed_the_available_hotels() {

	}

	@When("User selects one of the available hotel")
	public void user_selects_one_of_the_available_hotel() {
		//searchResults = new SearchResultsPage();
		searchResults = pageObjectManager.getSearchResultsPage();
		searchResults.clickSearchResult();
	}

	@When("User should click on continue button")
	public void user_should_click_on_continue_button() {
		searchResults.clickContinue();
	}

	@Then("User should be navigated to payment page")
	public void user_should_be_navigated_to_payment_page() {

	}

	@When("User should enter {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_enter_and(String firstName, String lastName, String billingAddress, String creditCardNo,
			String creditCardType, String expiryMonth, String expiryYear, String cvv) {

		bookHotelPage = pageObjectManager.getBookHotelPage();
		//bookHotelPage = new BookHotelPage();
		bookHotelPage.bookingDetails(firstName, lastName, billingAddress, creditCardNo, creditCardType, expiryMonth, expiryYear, cvv);

	}

	@When("User should click on Book Now button")
	public void user_should_click_on_Book_Now_button() {
		//bookHotelPage = new BookHotelPage();
		//click(bookHotelPage.getBtnBookNow());
		bookHotelPage.clickBookNow();
	}

	@Then("Order ID should be displayed")
	public void order_ID_should_be_displayed() throws InterruptedException {
		Thread.sleep(10000);
		//bookingConfirmPage = new BookingConfirm();
		bookingConfirmPage = pageObjectManager.getBookingConfirmPage();
		orderId = bookingConfirmPage.getAttributeOrderId();
		//driverQuit();
	}
	
	@When("User should click on My Itinerary button")
	public void user_should_click_on_My_Itinerary_button() {
	    bookingConfirmPage.clickMyItinerary();
	}

	@When("User should be navigated to Booked Itinerary page")
	public void user_should_be_navigated_to_Booked_Itinerary_page() {
	    
	}

	@When("User should pass the booked Order Id in the search box and click on Go button")
	public void user_should_pass_the_booked_Order_Id_in_the_search_box_and_click_on_Go_button() {
	    
	}

	@When("User is displayed the order details and he selects that particular order")
	public void user_is_displayed_the_order_details_and_he_selects_that_particular_order() {
	   
	}

	@When("User should click on Cancel Selected button")
	public void user_should_click_on_Cancel_Selected_button() {
	    bookedItineraryPage = pageObjectManager.getBookedItineraryPage();
	    bookedItineraryPage.cancel(orderId);
	}

	@When("User should confirm in the displayed alert")
	public void user_should_confirm_in_the_displayed_alert() {
	    acceptAlert();
	}

	@Then("booking should be cancelled")
	public void booking_should_be_cancelled() {
	    
	}

}
