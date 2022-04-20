package Prueba.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/automatizacion_booking_casos.feature",
        glue = "Prueba/stepdefinitions",
        //tags =  "@caso2",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTagBooking {
}
