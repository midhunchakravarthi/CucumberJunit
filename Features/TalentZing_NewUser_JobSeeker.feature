Feature: This feature is designed to add an new user to the system for jobseeker module
@Vamshi
  Scenario: Adding a new job seeker to the system
    Given Launch the chrome browser
    And click on Register link and click on JobSeeker link
    And verify JobSeeker page is displayed
    Then fill PersonalDetails
    Then fill ProfessionalDetails
    Then fill EducationDetails
    And verify user is registered sucessfully
 
