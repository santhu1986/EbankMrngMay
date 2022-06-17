Feature: Role Creation

Scenario Outline: Role Creation With Multiple Sets of Data

Given Tester Should Ranford HP

When Tester Enter Username password and click on Login

Then Tester Click on Role button

When Tester Click on New Role and enters "<RoleName>" and "<RoleType>"

Then Tester Close Application

Examples:

      | RoleName | RoleType |
      | GmanageryesBank | E |
      | AmanagerYesBank | E |
      | TelleerYesBAnk  | E |
       