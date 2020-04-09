Feature: Demoblaze Login

    @tag1
    Scenario: To check the Logo presence on Demoblaze OpeningPage
    Given user launches the chrome browser
    And user enters the url and opens the site
    Then user verifies the logo whether present or not
    And verify the title of the page
    And user closes the browser
    
    
    @tag2
    Scenario Outline: To check the login process
    Given user launches the chrome browser
    And user enters the url and opens the site
    And clicks on the log in link
    Then user gives his username "<uname>" and password "<pwd>"
    And clicks on the login button
    And user closes the browser
    
    Examples:
    |uname|pwd|
    |pallavi|pallavi|
    |sri|qwerty123|
    
    
    @tag3
    Scenario: AboutUs Page
    Given user launches the chrome browser
    And user enters the url and opens the site
    And clicks on the log in link
    Then user gives his username "pallavi" and password "pallavi"
    And logs in
    Given the user enters the home page
    And clicks on About Us 
    Then the user checks if directed to right page
    And checks whether the video is available or not
    And close the About us page
    And user closes the browser
    
    
    @tag4
    Scenario: ContactUs Page
    Given user launches the chrome browser
    And user enters the url and opens the site
    And clicks on the log in link
    Then user gives his username "pallavi" and password "pallavi"
    And logs in
    Given the user enters the home page
    And clicks on Contact
    Then the user checks if directed to contact page
    And user gives contact email as "hffyfyiuh@gmail.com" and name "heyyy" and message as "hi"
    And sends the message
    And user closes the browser
    
    
    @tag5
    Scenario: No of mobiles
    Given user launches the chrome browser
    And user enters the url and opens the site
    And clicks on the Phones link
    And Return the count of mobiles
    And user closes the browser
    
    
    @tag6
    Scenario: read from excel
    Given user launches the chrome browser
    And user enters the url and opens the site
    And clicks on the log in link
    Then user gives his username <uname> and password <pwd>
    And clicks on the login button
    And user closes the browser
   