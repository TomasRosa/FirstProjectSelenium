package steps;

import io.cucumber.java.en.*;

import pages.PaginaPrincipal;
import pages.PaginaRegistro;
import pages.PaginaCursos;
import pages.PaginaFundamentosDelTesting;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

public class TomasRosaSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos paginaCursos = new PaginaCursos();
    PaginaFundamentosDelTesting paginaFundamentosDelTesting = new PaginaFundamentosDelTesting();
    PaginaRegistro paginaRegistro = new PaginaRegistro();

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
    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans()
    {
        List<String> lista = paginaRegistro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 12 productos","Academia: $176 / año • 12 productos","Free: Gratis • 3 productos");

        Assert.assertEquals(lista,listaEsperada);
    }
}
