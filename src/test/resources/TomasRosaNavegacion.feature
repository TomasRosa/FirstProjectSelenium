#Titulo del feature
Feature: Navigation bar
#Descripcion del feature
#Traduccion: Para ver las subpaginas sin estar logeado yo puedo clickear en los links de la barra de navegación.
   To see the subpages
   Without logging in
   I can click in the navigation bar links
#Scenario - Caso de prueba.   
#Traduccion: Yo puedo acceder a las subpaginas atraves de la barra de navegacion.
Scenario: I can access the subpages through the navigation bar
    #Traduccion: Yo puedo navegar a ... Cuando yo intento acceder a las secciones libres a traves de la navigation bar
    #Traduccion: Yo soy redirigido a la pagina de la derecha.
    Given I navigate to www.freerangtesters.com
    When I try to access the free sections through the navigation bar
    Then I am redirected to the right page

