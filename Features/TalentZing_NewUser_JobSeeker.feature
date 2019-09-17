Feature: This feature is designed to add an new user to the system for jobseeker module

  @Vamshi
  Scenario: Adding a new job seeker to the system
    Given Launch the CHROME browser
    And click on Register link and click on JobSeeker link
    And user pass the following data for the personal details
      | FirstName | LastName | MiddleName | Gender |
      | User01    | Last02   | Mname      | Male   |
