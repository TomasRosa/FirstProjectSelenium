package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
import pages.PaginaCursos;
import pages.PaginaFundamentosDelTesting;

public class TomasRosaSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos paginaCursos = new PaginaCursos();
    PaginaFundamentosDelTesting paginaFundamentosDelTesting = new PaginaFundamentosDelTesting();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT()
    {
        landingPage.navigateToFreeRangeTesters();
    }
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section)
    {
        landingPage.clickOnSectionNavigationBar(section);
    }
    @When("I select Elegir Plan")
    public void selectElegirPlan()
    {
        landingPage.clickOnElegirPlanButton();
    }
    @And("Select Fundamentos del Testing")
    public void navigateToFundamentos() {
        paginaCursos.clickFundamentosTesting();
        paginaFundamentosDelTesting.clickIntroduccionAlTestingLink();
    }
}
