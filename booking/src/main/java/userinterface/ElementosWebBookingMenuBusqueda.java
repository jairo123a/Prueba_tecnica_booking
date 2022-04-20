package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebBookingMenuBusqueda {
    public static final Target TEXTOALOJAMIENTO = Target.the("Texto campo alojamiento").located(By.xpath("//a[@class='e13098a59f']//div[contains(text(),'Hotel Greenview Medellin')]"));
}
