package tasks;

import model.BookingDataDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.ElementosWebVuelosCampos;
import util.Constantes;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DiligenciarUnVuelo implements Task {

    List<BookingDataDrive> losdatos;


    public DiligenciarUnVuelo(List<BookingDataDrive> losdatos) {
        this.losdatos=losdatos;
    }

    public static DiligenciarUnVuelo conLos(List<BookingDataDrive> datos)
    {
        return new DiligenciarUnVuelo(datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebVuelosCampos.BOTONVUELOS),
                Click.on(ElementosWebVuelosCampos.DESDE),
                Click.on(ElementosWebVuelosCampos.DESTINO),
                Click.on(ElementosWebVuelosCampos.CAMBIODESTINO),
                Click.on(ElementosWebVuelosCampos.DESDE),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getDestino()).into(ElementosWebVuelosCampos.DESDETXT),
                WaitUntil.the(ElementosWebVuelosCampos.ESPERARCIUDADL, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ElementosWebVuelosCampos.CLICKDESDEOPCION),
                Hit.the(Keys.ENTER).into(ElementosWebVuelosCampos.DESDETXT),
                Click.on(ElementosWebVuelosCampos.FECHAINICIOCLICK),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getFechaida()).into(ElementosWebVuelosCampos.FECHAINICIOTXT),
                Click.on(ElementosWebVuelosCampos.FECHAFINTXT),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getFechavuelta()).into(ElementosWebVuelosCampos.FECHAINICIOTXT),
                Click.on(ElementosWebVuelosCampos.CONTINUAR)
        );
    }
}
