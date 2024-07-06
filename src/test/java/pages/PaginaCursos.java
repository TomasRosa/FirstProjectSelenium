package pages;

public class PaginaCursos extends BasePage 
{
    private String fundamentosTestingLink = "//h3[normalize-space()='Fundamentos del Testing']";


    ///Constructor PaginaCursos extiende de BasePage (super).
    public PaginaCursos()
    {
        super(driver);
    }
    public void clickFundamentosTesting()
    {
        clickElement(fundamentosTestingLink);
    }    
}
