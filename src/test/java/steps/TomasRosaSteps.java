package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class TomasRosaSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT()
    {
        landingPage.navigateToFreeRangeTesters();
    }
}
