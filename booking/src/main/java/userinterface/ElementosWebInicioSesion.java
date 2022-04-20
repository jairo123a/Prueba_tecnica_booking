package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebInicioSesion {

    public static final Target INICIARSESION = Target.the("Boton Inicio Sesion").located(By.xpath("//div[@class='bui-group__item']//span[@class='bui-button__text' and contains(text(),'Inicia sesión')]"));
    public static final Target USUARIO = Target.the("Campo Usuario").located(By.id("username"));
    public static final Target CONTINUAR = Target.the("Boton Inicio Sesion continuar").located(By.cssSelector("body.ltr.bbMqoHAKmYcAsn2Q2xle:nth-child(2) div.bui-u-text-left.bui_font_body:nth-child(6) div.app div.access-container.bui_font_body div.access-panel-container div.access-panel.nw-access-panel div.transition-container div.animate-height div.sliding-panel div.transition.bui-panel-body form.nw-signin div:nth-child(3) > button.Wm0cMj3qmJ6uOrvNJ_gL.vG6MwHiG5509Ezzvohc7.AAQpVL26KBUYrogb1HSX.TCYNuP4sieBwLMStmx7l.Eb2yn3kPWTu8vaNwgxqw.YbrPaJ5QL1sl414mFY64"));
    public static final Target VERIFICACIONUSUARIO= Target.the("Campo verificacion Usuario").located(By.id("username-note"));

}
