package tasks;

import model.BookingDataDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ElementosWebBooKingPassword;
import userinterface.ElementosWebBooKingRegistro;
import userinterface.ElementosWebBookingIndex;
import util.Constantes;

import java.util.List;


public class Registrar implements Task {
    List<BookingDataDrive> losdatos;
    public Registrar(List losdatos){
        this.losdatos=losdatos;
    }

    public static Registrar unUsuarioCon(List<BookingDataDrive> losdatos){
        return new Registrar(losdatos);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Click.on(ElementosWebBookingIndex.CUENTA),
                 Enter.theValue(losdatos.get(Constantes.NUMERO).getCorreo()).into(ElementosWebBooKingRegistro.USUARIO),
                 Click.on(ElementosWebBooKingRegistro.CONTINUAR),
                 Enter.theValue(losdatos.get(Constantes.NUMERO).getPassword1()).into(ElementosWebBooKingPassword.PASSWORD1),
                 Click.on(ElementosWebBooKingPassword.PASSWORD2),
                 Enter.theValue(losdatos.get(Constantes.NUMERO).getPassword2()).into(ElementosWebBooKingPassword.PASSWORD2),
                 Click.on(ElementosWebBooKingPassword.CONTINUA)
         );
    }
}
