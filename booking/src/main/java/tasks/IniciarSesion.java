package tasks;

import model.BookingDataDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ElementosWebInicioSesion;
import util.Constantes;

import java.util.List;

public class IniciarSesion implements Task {
    List<BookingDataDrive> losdatos;


    public IniciarSesion(List<BookingDataDrive>  losdatos) {
    this.losdatos=losdatos;
    }

    public static IniciarSesion conlos(List<BookingDataDrive> losdatos)
    {
            return new IniciarSesion(losdatos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(ElementosWebInicioSesion.INICIARSESION),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getCorreosession()).into(ElementosWebInicioSesion.USUARIO),
                Click.on(ElementosWebInicioSesion.CONTINUAR)
        );
    }
}
