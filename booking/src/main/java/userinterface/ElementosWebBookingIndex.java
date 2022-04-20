package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ElementosWebBookingIndex {

    public static final Target CUENTA = Target.the("click en Hazte una cuenta").located(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']//span[contains(text(),'Hazte una cuenta') and @class='bui-button__text']"));
    public static final Target BUSCARCIDUDAD = Target.the("Digitar la cidudad").located(By.id("ss"));
    public static final Target CLICKCIUDADATRACCION = Target.the("Digitar la cidudad").located(By.xpath("//li[@class='c-autocomplete__item sb-autocomplete__item sb-autocomplete__item-with_photo sb-autocomplete__item__item--elipsis sb-autocomplete__item--icon_revamp sb-autocomplete__item--hotel ']"));
    public static final Target BUSCARBOTON = Target.the("Botom buscar").located(By.xpath("//button[@data-sb-id='main']"));
    public static final Target VERIFICACION = Target.the("Texto de verificacion").located(By.xpath("//h3[contains(text(),'¿Eres un robot?')]"));
}
