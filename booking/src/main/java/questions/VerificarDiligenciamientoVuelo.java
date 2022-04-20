package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebVuelosCampos;

public class VerificarDiligenciamientoVuelo implements Question {
    String dato;

    public VerificarDiligenciamientoVuelo(String pregunta) {
        this.dato = pregunta;

    }

    public static VerificarDiligenciamientoVuelo conEl(String dato) {
        return new VerificarDiligenciamientoVuelo(dato);

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        respuesta = Text.of(ElementosWebVuelosCampos.VERIFICARDISPONIBILIDADVUELO).viewedBy(actor).asString();
        if (respuesta.equals(dato)) {
            return true;
        } else {
            return false;
        }

    }
}
