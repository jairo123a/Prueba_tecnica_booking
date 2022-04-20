package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebInicioSesion;

public class VerificarMensajeCorreo implements Question {
    String dato;
    public VerificarMensajeCorreo(String pregunta){
        this.dato=pregunta;
    }


    public static VerificarMensajeCorreo IncorrectoconEl(String dato) {
        return new VerificarMensajeCorreo(dato);
    }


    @Override
    public Object answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ElementosWebInicioSesion.VERIFICACIONUSUARIO).viewedBy(actor).asString();
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



