package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebBooKingPassword {

    public static final Target PASSWORD1 = Target.the("Pasword 1").located(By.id("new_password"));
    public static final Target PASSWORD2 = Target.the("Pasword 2").located(By.id("confirmed_password"));
    public static final Target CONTINUA = Target.the("Continuar").located(By.xpath("//button[@type='submit']"));

}
