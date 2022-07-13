Feature: Role Creation

Scenario Outline: Role Creation with Multiple sets of Data

Given User should on RanfordHP

When User enter username password and click on login

Then User click on Role button

When User click on New Role and enters "<RoleName>" and "<RoleType>"

Then User Close the Applocation

Examples:

               | RoleName | RoleType |
               | Cashieraxisbk | E |
               | TelleraxisBk | E |
               | Gmanager | E |