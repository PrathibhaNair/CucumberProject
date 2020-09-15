package com.manager;

import org.pages.BookHotelPage;
import org.pages.BookedItineraryPage;
import org.pages.BookingConfirm;
import org.pages.LoginPage;
import org.pages.SearchPage;
import org.pages.SearchResultsPage;

public class PageObjectManager {

	private static PageObjectManager pageObjectManager;

	private PageObjectManager() {

	}

	public static PageObjectManager getInstance() {

		return (pageObjectManager == null) ? pageObjectManager = new PageObjectManager() : pageObjectManager;

	}

	private LoginPage loginPage;
	private SearchPage searchPage;
	private SearchResultsPage searchResultsPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirm bookingConfirmPage;
	private BookedItineraryPage bookedItineraryPage;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchPage getSearchPage() {
		return (searchPage == null) ? searchPage = new SearchPage() : searchPage;
	}

	public SearchResultsPage getSearchResultsPage() {
		return (searchResultsPage == null) ? searchResultsPage = new SearchResultsPage() : searchResultsPage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

	public BookingConfirm getBookingConfirmPage() {
		return (bookingConfirmPage == null) ? bookingConfirmPage = new BookingConfirm() : bookingConfirmPage;
	}

	public BookedItineraryPage getBookedItineraryPage() {
		return (bookedItineraryPage == null) ? bookedItineraryPage = new BookedItineraryPage() : bookedItineraryPage;
	}

}
