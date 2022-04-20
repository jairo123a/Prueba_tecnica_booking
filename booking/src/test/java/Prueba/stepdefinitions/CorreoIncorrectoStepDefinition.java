package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.BookingDataDrive;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarMensajeCorreo;
import tasks.IniciarSesion;

import java.util.List;

public class CorreoIncorrectoStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @When("^ingreso en iniciar sesion y Digito los datos$")
    public void ingresoEnIniciarSesionYDigitoLosDatos(List<BookingDataDrive> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.conlos(datos));
    }


    @Then("^Verifico el mensaje  \"([^\"]*)\"$")
    public void verificoElMensaje(String dato) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMensajeCorreo.IncorrectoconEl(dato)));
    }



}
