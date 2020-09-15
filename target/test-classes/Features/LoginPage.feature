Feature: Verifying the Adactin Hotel functionalities for various room types

  @E2E
  Scenario Outline: Verifying Adactin Hotel login details
    Given User is on the Adactin Hotel page
    When User should enter "<userName>" and "<password>"
    And User should click on the login button
    Then User should be logged in
    When User should enter "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>", "<childrenPerRoom>"
    And User should click on the search button
    Then User should be displayed the available hotels
    When User selects one of the available hotel
    And User should click on continue button
    Then User should be navigated to payment page
    When User should enter "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNo>", "<creditCardType>", "<expiryMonth>", "<expiryYear>" and "<cvv>"
    And User should click on Book Now button
    Then Order ID should be displayed
    When User should click on My Itinerary button
    And User should be navigated to Booked Itinerary page
    And User should pass the booked Order Id in the search box and click on Go button
    And User is displayed the order details and he selects that particular order
    And User should click on Cancel Selected button
    And User should confirm in the displayed alert
    Then booking should be cancelled

    Examples: 
      | userName | password  | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress         | creditCardNo     | creditCardType   | expiryMonth | expiryYear | cvv |
      | Evi12345 | evi@12345 | Sydney   | Hotel Creek | Standard | 1 - One   | 31/08/2020  | 03/09/2020   |             2 |               2 | Evi       | Nair     | Temple Street, Chicago | 1234123412341234 | American Express | January     |       2021 | 321 |

  @LoginScenario
  Scenario Outline: Verifying Adactin Hotel login details with invalid credentials
    Given User is on the Adactin Hotel page
    When User should enter "<userName>" and "<password>"
    And User should click on the login button
    Then User should be logged in

    Examples: 
      | userName | password | 
      | Evi12345 | evi@     | 
