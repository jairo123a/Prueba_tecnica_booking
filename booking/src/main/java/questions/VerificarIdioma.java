package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebCambioIdioma;

public class VerificarIdioma implements Question {
    String dato;
    public VerificarIdioma(String pregunta){
        this.dato=pregunta;

    }
    public static VerificarIdioma conEl(String dato) {
        return new VerificarIdioma(dato);
    }





    @Override
    public Object answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ElementosWebCambioIdioma.CAMPOIDIOMA).viewedBy(actor).asString();
        if(respuesta.equals(dato)){
            return true;
        }else
        {
            return false;
        }
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
