package reto.phptravels.userintefaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPostPagina {
    public static final Target BLOG = Target.the("blog").located(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[14]/a"));
    public static final Target POST = Target.the("blog").located(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[14]/ul/li[1]/a"));
    public static final Target BOTON_ANADIR = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[2]/form/button"));
    public static final Target TITULO = Target.the("titulo").located(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/input"));
    public static final Target LINK = Target.the("agregar link").located(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[1]/div/div[1]/div[1]/div[2]/div/input"));
    public static final Target IFRAME = Target.the("texto").located(By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/iframe[1]"));
    public static final Target TEXTO2 = Target.the("texto").located(By.xpath("/html/body"));
    public static final Target PALABRAS_CLAVES = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[1]/div/input"));
    public static final Target DESCRIPCION = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/input"));

    public static final Target SELECCIONAR_ESTADO = Target.the("estado").located(By.name("status"));
    public static final Target SELECCIONAR_CATEGORIA = Target.the("estado").located(By.name("category"));

    public static final Target RELATIONS = Target.the("estado").located(By.id("s2id_autogen2"));
    public static final Target  CARGAR_IMG = Target.the("estado").located(By.id("image_default"));



    ///


}
