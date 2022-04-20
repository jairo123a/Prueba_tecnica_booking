package tasks;

import model.BookingDataDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ElementosWebBookingIndex;
import util.Constantes;

import java.util.List;

public class BuscarAlojamiento implements Task {
    List<BookingDataDrive> losdatos;

    public BuscarAlojamiento(List<BookingDataDrive> losdatos) {
      this.losdatos=losdatos;
    }


    public static BuscarAlojamiento conEl(List<BookingDataDrive> losdatos){

        return new BuscarAlojamiento(losdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
               Enter.theValue(losdatos.get(Constantes.NUMERO).getCiudad()).into(ElementosWebBookingIndex.BUSCARCIDUDAD),
                Click.on(ElementosWebBookingIndex.CLICKCIUDADATRACCION),
                Click.on(ElementosWebBookingIndex.BUSCARBOTON)
        );
    }
}
