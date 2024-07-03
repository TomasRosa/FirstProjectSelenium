package pages;
///Page Object Class
public class PaginaPrincipal extends BasePage {
    
    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }
}
