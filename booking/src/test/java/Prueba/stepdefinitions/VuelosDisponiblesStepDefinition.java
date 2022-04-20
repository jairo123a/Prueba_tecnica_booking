package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.BookingDataDrive;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarDiligenciamientoVuelo;
import tasks.DiligenciarUnVuelo;


import java.util.List;

public class VuelosDisponiblesStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^ingreso en Vuelos y Diligencio todos los campos$")
    public void ingresoEnVuelosYDiligencioTodosLosCampos(List<BookingDataDrive> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarUnVuelo.conLos(datos));
    }

    @Then("^Verifico la disposibilidad del Vuelos para esa fecha \"([^\"]*)\"$")
    public void verificoLaDisposibilidadDelVuelosParaEsaFecha(String dato) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarDiligenciamientoVuelo.conEl(dato)));
    }

    }
