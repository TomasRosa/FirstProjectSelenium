package pages;

public class PaginaFundamentosDelTesting extends BasePage 
{
    private String introduccionAlTestingLink = "//h4[normalize-space()='Introducción al Testing de Software']";

    public PaginaFundamentosDelTesting ()
    {
        super(driver);
    }
    public void clickIntroduccionAlTestingLink()
    {
        clickElement(introduccionAlTestingLink);
    }
}
