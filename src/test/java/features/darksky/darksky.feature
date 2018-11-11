#Selenium Challenge

#1. Create a branch on your project with name "darksky"
#2. Switch to that branch
#3. Implement below Scenario in cucumber
#Step1: Goto "https://darksky.net/"
#Step2: Clear search text field
#Step3: Enter address or zipcode into the search field
#Step4: Click on search magnifying glass
#Step5: Verify current temperature is between low and high value
#4. Create PR and submit the challenge



Feature: Open Main Page
  This feature opens main web page

  @darksky_search
  Scenario: Open main page
    Given Goto
      | URL                 |
      | https://darksky.net |

    And Clear search text field
      | Field locator               |
      | //*[@id="searchForm"]/input |

    And Enter address or zipcode into the search field
      | Field locator               | Data  |
      | //*[@id="searchForm"]/input | 07432 |

    And Click on search magnifying glass
      | Button locator                 |
      | //*[@id="searchForm"]/a[2]/img |

    And Verify current temperature is between low and high value
      | Current value                            | Low value locator                                | High value locator                               |
      | //*[@id="title"]/span[1]/span[2]/span[1] | //*[@id="title"]/span[1]/span[2]/span[2]/span[2] | //*[@id="title"]/span[1]/span[2]/span[2]/span[3] |