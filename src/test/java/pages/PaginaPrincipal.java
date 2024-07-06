package pages;
///Page Object Class
public class PaginaPrincipal extends BasePage {
    
    // private String loginButton = "//a[@class='sc-eeDSqt gLwFuo']";
    // private String emailInput= "//input[@id='email']";
    // private String passwordInput = "//input[@id='password']";
    
    private String sectionLink = "//a[normalize-space()='%s' and @href]"; 
    private String elegirPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    //Con el and @href le indicamos que es un normalize-space (con su respectivo nombre) y ademas 
    //es un HREF, para que Selenium logre identificar.


    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
        /* 
        clickElement(loginButton);
        write(emailInput, "tomaslautarorosa@gmail.com");
        write(passwordInput, "auto1234");
        */
    }
    public void clickOnSectionNavigationBar(String section)
    {
        ///Reemplazar el %s de posición en sectionLink con el nombre.
        String XPathSection = String.format(sectionLink,section);
        clickElement(XPathSection);
    }
    public void clickOnElegirPlanButton()
    {
        clickElement(elegirPlanButton);
    }

}
