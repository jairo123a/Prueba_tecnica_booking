package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import userinterface.ElementosWebBookingMenuBusqueda;
import userinterface.ElementosWebInicioSesion;


import java.util.List;

public class VerificarElAlojamiento implements Question {
    String dato;
    private Target lista;

    public VerificarElAlojamiento(String pregunta) {
        this.dato = pregunta;

    }

    public static VerificarElAlojamiento conEl(String dato) {
        return new VerificarElAlojamiento(dato);

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        {
            String respuesta;
            respuesta= Text.of(ElementosWebBookingMenuBusqueda.TEXTOALOJAMIENTO).viewedBy(actor).asString();
            if(respuesta.equals(dato)){
                return true;
            }else
            {
                return false;
            }

        }
    }

}