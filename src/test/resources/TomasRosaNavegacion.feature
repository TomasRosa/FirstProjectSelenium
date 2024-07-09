@Navigation
Feature: Navigation
   To see the subpages without logging in, I can click in the navigation bar links

   Background: I am on the Free Range Tester web without logging in.
      Given I navigate to www.freerangetesters.com

   Scenario Outline: Scenario Outline name: I can access the subpages through the navigation bar
      When I go to <section> using the navigation bar
      Examples:
         | section   |
         | Cursos    |
         | Recursos  |
         | Blog      |
         | Mentorías |
         | Udemy     |
   @Courses
   Scenario: Courses are presented correctly to potential customers
      When I go to Cursos using the navigation bar
      And I Select Fundamentos del Testing

   @Plans @Courses
   Scenario: Users can select a plan when signing up
      When I select Elegir Plan
      Then The client can validate the options in the checkout page