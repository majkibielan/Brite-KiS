@first-screen
  Feature: Fill form on the course registration page

    Scenario: Fill course registration form on the first screen in polish language
      Given an open browser with https://kozminski--qa.sandbox.my.site.com/s/course-registration?language=pl
      And I populate course section
      And I populate personal details section without PESEL number
      And I populate mailing address section
      When I check consents and proceed to next screen
      Then Second screen is displayed