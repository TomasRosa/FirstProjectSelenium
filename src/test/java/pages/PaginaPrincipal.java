package pages;
///Page Object Class
public class PaginaPrincipal extends BasePage {
    
    private String loginButton = "//a[@class='sc-eeDSqt gLwFuo']";
    private String emailInput= "//input[@id='email']";
    private String passwordInput = "//input[@id='password']";

    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
        clickElement(loginButton);
        write(emailInput, "tomaslautarorosa@gmail.com");
        write(passwordInput, "auto1234");
    }

}
