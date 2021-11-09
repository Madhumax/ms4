Feature: Application Validation

Scenario: Learn More Module Validation
Given user chooses the browser third testcase
And navigated to tideurl for third testcase
When user clicks on learnmore tab
Then validate the learnmorepage contains "How To ReadLaundry Symbols" word
And close the browser for third test case