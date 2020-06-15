#Author:fizikuludag@gmail.com
  @regression
Feature: As an admin I should be able to add employee's multiple dependents

  Background: Addind multiple dependents
    Given user logged in with valid admin username "Admin" and password "Hum@nhrm123"
    Then user navigated to employee list page
    And user searched employee by employee ID "11390"
    Then user seleceted to employee and navigated to personal details page
    And user clicked on dependents link and navigate to Assigned Dependents page


  Scenario Outline: Addind multiple dependents
    Then user added multiple dependents name "<DependentName>"
    And user selected dependents relationship "<RelationShip>" and specify relationship "<relations>"
    And user selected dependents birthdates "<month>","<day>","<year>" and click save

    Examples: 
      | DependentName | RelationShip | relations | month | day | year |
      | Zeynep Gulec  | Other        | doughter  | Jun   |  06 | 2015 |
      | Eylul Erdem   | Other        | cousin    | May   |  12 | 1989 |
      | Hilal Dogru   | Other        | friend    | Apr   |  27 | 1984 |

 @progress
  Scenario: Addind multiple dependents
    Then user added multiple dependents information
    
    | DependentName | RelationShip | relations | birthDate   |
      | Zeynep Gulec  | Other        | doughter  | 2015-Jun-06 |
      | Eylul Erdem   | Other        | cousin    | 1989-May-12 |
      | Hilal Dogru   | Other        | friend    | 1984-Apr-27 | 
    
    
    
    


     