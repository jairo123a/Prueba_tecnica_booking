package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebCambioIdioma {

    public static final Target IDIOMA = Target.the("Icono para cambio de idioma").located(By.xpath("//button[@data-tooltip-text='Elegir el idioma que prefieres']"));
    public static final Target CAMBIODEIDIOMA = Target.the("Campo Buscar Pais").located(By.xpath("//*[@id=\"language-selection\"]/div/div/div/div/div/div[1]/div/div[2]/div/ul/div[1]/ul/li[2]/a/div"));
    public static final Target CAMPOIDIOMA = Target.the("texto para verificar el idioma").located(By.xpath("//span[contains(text(),'Register')]"));

}
