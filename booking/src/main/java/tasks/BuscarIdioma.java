package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.ElementosWebCambioIdioma;


public class BuscarIdioma implements Task {

        public BuscarIdioma() {
        }

        public static BuscarIdioma conEl(){

            return new BuscarIdioma();
        }

        @Override
        public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Click.on(ElementosWebCambioIdioma.IDIOMA),
                    Click.on(ElementosWebCambioIdioma.CAMBIODEIDIOMA)
            );
        }
}
