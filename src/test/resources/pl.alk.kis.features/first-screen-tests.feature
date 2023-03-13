@first-screen
  Feature: Fill form on the form page

    Scenario: Fill polish form on the first screen
      Given an open browser with https://kozminski--qa.sandbox.my.site.com/s/course-registration?language=pl
      And I populate course section
      And I populate personal details section without PESEL number
      And I populate mailing address section
      When I check consents and proceed to next screen
      Then Second screen is displayed