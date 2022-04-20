package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebBooKingRegistro {


    public static final Target USUARIO = Target.the("Imgresar Usuario").located(By.id("username"));
    public static final Target CONTINUAR = Target.the("click en Continuar").located(By.xpath("//span[contains(text(),'Continuar con e-mail')]"));
}
