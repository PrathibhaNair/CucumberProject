$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verifying the Adactin Hotel functionalities for various room types",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Adactin Hotel login details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin Hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.step({
  "name": "User should enter \"\u003clocation\u003e\", \"\u003chotels\u003e\", \"\u003croomType\u003e\", \"\u003cnoOfRooms\u003e\", \"\u003ccheckInDate\u003e\", \"\u003ccheckOutDate\u003e\", \"\u003cadultsPerRoom\u003e\", \"\u003cchildrenPerRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on the search button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be displayed the available hotels",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects one of the available hotel",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be navigated to payment page",
  "keyword": "Then "
});
formatter.step({
  "name": "User should enter \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", \"\u003cbillingAddress\u003e\", \"\u003ccreditCardNo\u003e\", \"\u003ccreditCardType\u003e\", \"\u003cexpiryMonth\u003e\", \"\u003cexpiryYear\u003e\" and \"\u003ccvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on Book Now button",
  "keyword": "And "
});
formatter.step({
  "name": "Order ID should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User should click on My Itinerary button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be navigated to Booked Itinerary page",
  "keyword": "And "
});
formatter.step({
  "name": "User should pass the booked Order Id in the search box and click on Go button",
  "keyword": "And "
});
formatter.step({
  "name": "User is displayed the order details and he selects that particular order",
  "keyword": "And "
});
formatter.step({
  "name": "User should click on Cancel Selected button",
  "keyword": "And "
});
formatter.step({
  "name": "User should confirm in the displayed alert",
  "keyword": "And "
});
formatter.step({
  "name": "booking should be cancelled",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotels",
        "roomType",
        "noOfRooms",
        "checkInDate",
        "checkOutDate",
        "adultsPerRoom",
        "childrenPerRoom",
        "firstName",
        "lastName",
        "billingAddress",
        "creditCardNo",
        "creditCardType",
        "expiryMonth",
        "expiryYear",
        "cvv"
      ]
    },
    {
      "cells": [
        "Evi12345",
        "evi@12345",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "31/08/2020",
        "03/09/2020",
        "2",
        "2",
        "Evi",
        "Nair",
        "Temple Street, Chicago",
        "1234123412341234",
        "American Express",
        "January",
        "2021",
        "321"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Adactin Hotel login details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Adactin Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.user_is_on_the_Adactin_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Evi12345\" and \"evi@12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Sydney\", \"Hotel Creek\", \"Standard\", \"1 - One\", \"31/08/2020\", \"03/09/2020\", \"2\", \"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#location\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-DNSN97O3\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\PRATHI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57070}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 78924401299dbcc71884b1c4d84d92c3\n*** Element info: {Using\u003did, value\u003dlocation}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat com.base.Base.selByVisibleText(Base.java:179)\r\n\tat org.pages.SearchPage.searchHotels(SearchPage.java:95)\r\n\tat com.stepdefinition.LoginPageStep.user_should_enter(LoginPageStep.java:63)\r\n\tat ✽.User should enter \"Sydney\", \"Hotel Creek\", \"Standard\", \"1 - One\", \"31/08/2020\", \"03/09/2020\", \"2\", \"2\"(src/test/resources/Features/LoginPage.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should click on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be displayed the available hotels",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_be_displayed_the_available_hotels()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects one of the available hotel",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_selects_one_of_the_available_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigated to payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_be_navigated_to_payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter \"Evi\", \"Nair\", \"Temple Street, Chicago\", \"1234123412341234\", \"American Express\", \"January\", \"2021\" and \"321\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click on Book Now button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_Book_Now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Order ID should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.order_ID_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click on My Itinerary button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_My_Itinerary_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigated to Booked Itinerary page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_be_navigated_to_Booked_Itinerary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should pass the booked Order Id in the search box and click on Go button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_pass_the_booked_Order_Id_in_the_search_box_and_click_on_Go_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is displayed the order details and he selects that particular order",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_is_displayed_the_order_details_and_he_selects_that_particular_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click on Cancel Selected button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_Cancel_Selected_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should confirm in the displayed alert",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_confirm_in_the_displayed_alert()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "booking should be cancelled",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.booking_should_be_cancelled()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verifying Adactin Hotel login details with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginScenario"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin Hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "Evi12345",
        "evi@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Adactin Hotel login details with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginScenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Adactin Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.user_is_on_the_Adactin_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Evi12345\" and \"evi@\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});