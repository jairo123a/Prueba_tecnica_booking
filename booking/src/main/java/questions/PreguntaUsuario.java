package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebBookingIndex;

public class PreguntaUsuario implements Question {
    String pregunta;
    public PreguntaUsuario(String pregunta){
        this.pregunta=pregunta;
    }

    public static PreguntaUsuario seRegistro(String pregunta){
        return new PreguntaUsuario(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ElementosWebBookingIndex.VERIFICACION).viewedBy(actor).asString();
        if(respuesta.equals(pregunta)){
            return true;
        }else
        {
            return false;
        }
    }

}
