package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarIdioma;
import tasks.BuscarIdioma;

public class AjusteIdiomaStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @When("^ingreso el pais y hago click en buscar$")
    public void ingresoElPaisYHagoClickEnBuscar() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarIdioma.conEl());
    }

    @Then("^Verifico que el idioma cambie\"([^\"]*)\"$")
    public void verificoQueElIdiomaCambie(String dato) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarIdioma.conEl(dato)));
    }


}
