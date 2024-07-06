Feature: Navigation bar
   To see the subpages without logging in, I can click in the navigation bar links

# Scenario Outline: Scenario Outline name: I can access the subpages through the navigation bar
#     Given I navigate to www.freerangetesters.com
#     When I go to <section> using the navigation bar 
#    Examples:
#        | section|
#        | Cursos |
#        | Recursos |
#        | Blog |
#        | Mentorías |
#        | Udemy |

# Scenario: Courses are presented correctly to potential customers
#     Given I navigate to www.freerangetesters.com
#     When I go to Cursos using the navigation bar
#     And Select Fundamentos del Testing

Scenario: Users can select a plan when signing up
   Given I navigate to www.freerangetesters.com
   When I select Elegir Plan