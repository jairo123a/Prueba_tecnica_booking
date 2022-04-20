package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebVuelosCampos {
    public static final Target BOTONVUELOS= Target.the("Menu Vuelo").located(By.xpath("//span[ contains(text(),'Vuelos')]"));
    public static final Target DESDE = Target.the("Campo Desde el vuelo").located(By.xpath("//div[@class='_ia1']"));
    public static final Target CLICKDESDEOPCION = Target.the("Campo Desde el vuelo").located(By.xpath("//*[@id=\"ap-CTG/26923\"]/div[2]"));
    public static final Target DESTINO= Target.the("Campo Destino el vuelo").located(By.xpath("//*[@id=\"ap-MDE/30430\"]"));;
    public static final Target CAMBIODESTINO = Target.the("Campo Destino el vuelo").located(By.xpath("//div[@class='_kNN _kNO _iDB _i4n _ivP _iv1 _j0l _iVh _iwG _ieV _ihr _ihs _h-Y _h-Z _ibo _im4 _ihp _ihq _kOo _kOk _kOl _kOm _kOn _kOi _kOj']"));
    public static final Target DESDETXT = Target.the("Campo Destino el vuelo").located(By.xpath("//input[@name='origin']"));
    public static final Target ESPERARCIUDADL= Target.the("Campo Destino el vuelo").located(By.xpath("//div[contains(text(),'Cartagena de Indias, Colombia')]"));
    public static final Target FECHAINICIOCLICK= Target.the("Campo Destino el vuelo").located(By.xpath("//div[@class='_iaf _iEc _ia1 _i7r _iv1 _j0z _iPK _j0x _j0B _iai']"));
    public static final Target FECHAINICIOTXT= Target.the("Campo Destino el vuelo").located(By.xpath("//div[@class='input _iKG _id7 _ial _ii0 _iQj _iaj _ihh _idE'and @aria-label=\"Fecha de ida\"]"));
    public static final Target FECHAFINTXT= Target.the("Campo Destino el vuelo").located(By.xpath("//div[@class='input _iKG _id7 _ial _ii0 _iQj _iaj _ihh _idE'and @aria-label=\"Fecha de vuelta\"]"));
    public static final Target CONTINUAR= Target.the("Campo Fecha Inicial").located(By.xpath("//button[@class='Common-Widgets-Button-StyleJamButton theme-light Button-Gradient ui-button size-l searchButton _id7 _ihr _ihs _h-Y _im4 _ii0 _ihp _ihq _inw _iir _iae _jWT _iFQ _iFR _imQ _iv1']"));
    public static final Target VERIFICARDISPONIBILIDADVUELO= Target.the("Campo Fecha Final").located(By.xpath("//div[@class='bfLabel bf-best']"));

}
