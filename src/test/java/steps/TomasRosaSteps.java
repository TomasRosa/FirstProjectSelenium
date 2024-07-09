package steps;

import io.cucumber.java.en.*;

import pages.PaginaPrincipal;
import pages.PaginaRegistro;
import pages.PaginaCursos;
import pages.PaginaFundamentosDelTesting;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TomasRosaSteps {
    SoftAssert  soft = new SoftAssert();

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
    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void selectElegirPlan()
    {
        landingPage.clickOnElegirPlanButton();
    }
    @And("^(?:I|The user|The client) selects? Fundamentos del Testing$")
    public void navigateToFundamentos() {
        paginaCursos.clickFundamentosTesting();
        paginaFundamentosDelTesting.clickIntroduccionAlTestingLink();
    }
    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans()
    {
        List<String> lista = paginaRegistro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 13 productos","Academia: $176 / año • 13 productos","Free: Gratis • 3 productos");
        //Si no son iguales, tira una excepcion.
        Assert.assertEquals(lista,listaEsperada);
    }
    /* 
    public void ejemplulis()
    {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";

        Integer numeroLoco = 1;
        Integer numeroLoco2 = 2;

        Assert.assertEquals(numeroLoco, numeroLoco2);

        //Verificar que dos valores son iguales.
        Assert.assertEquals(palabraEncontrada, palabraEsperada);
        //Verifica que dos valores NO son iguales.
        Assert.assertNotEquals (palabraEncontrada,palabraEsperada);
        //Verificar que una condicion es TRUE.
        Assert.assertTrue(palabraEncontrada.contains(palabraEsperada));
        //Verificar que una condiciones es FALSE.
        Assert.assertFalse(palabraEncontrada.contains(palabraEsperada));

        //Soft Assertions: No detienen la ejecución al fallar. 
        // Ideal para verificar muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEncontrada,palabraEsperada);
        soft.assertTrue(palabraEsperada.contains(palabraEncontrada));
        soft.assertNotEquals(palabraEncontrada,palabraEsperada);

        soft.assertAll();
    }
    */
}
