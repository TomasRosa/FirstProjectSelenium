package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",   //Ubicación de nuestros features
glue = "steps", //Paquete donde tenemos nuestras clases definiendo los steps
plugin = { "pretty","html:target/cucumber-reports" } //Donde se van a guardar los reportes cuando algo falle.
)

public class TestRunner {

}
