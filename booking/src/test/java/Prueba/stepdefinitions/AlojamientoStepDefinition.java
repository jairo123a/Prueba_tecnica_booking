package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.BookingDataDrive;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarElAlojamiento;
import tasks.BuscarAlojamiento;


import java.util.List;

public class AlojamientoStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @When("^ingreso la ciudad y Digito los datos$")
    public void ingresoLaCiudadYDigitoLosDatos(List<BookingDataDrive> dato) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarAlojamiento.conEl(dato));
    }

    @Then("^Verifico el alojamiento\"([^\"]*)\"$")
    public void verificoElAlojamiento(String dato) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarElAlojamiento.conEl(dato)));
    }


}
