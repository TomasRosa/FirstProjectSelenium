Feature: Navigation bar
   To see the subpages without logging in, I can click in the navigation bar links

Scenario Outline: Scenario Outline name: I can access the subpages through the navigation bar
    Given I navigate to www.freerangetesters.com
    When I go to <section> using the navigation bar 
   Examples:
       | section|
       | Cursos |
       | Recursos |
       | Blog |
       | Mentorías |
       | Udemy |