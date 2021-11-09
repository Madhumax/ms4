Feature: Application Validation

Scenario Outline: Text Validation in Home Page
Given user chooses the browser for tide
And navigated to tideurl
When sends the word "Antibacterial" in the searchBox
Then validate the page contains "Antibacterial" word
And close the browser