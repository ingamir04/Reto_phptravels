package reto.phptravels.userintefaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroCategoriaBlog {
    public static final Target BLOG = Target.the("blog").located(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[14]/a"));
    public static final Target BLOG_CATEGORIA = Target.the("blog").located(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[14]/ul/li[2]/a"));
    public static final Target BOTON_ANADIR = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[1]/button"));
    public static final Target ANADIR_CATEGORIA = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[1]/div/input"));
    public static final Target SELECCIONAR_ESTADO = Target.the("estado").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[2]/div/select"));
    public static final Target NOMBRE_VIETNA = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[3]/div/input"));
    public static final Target NOMBRE_RUSO = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[4]/div/input"));
    public static final Target NOMBRE_ARABE = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[5]/div/input"));
    public static final Target NOMBRE_IRAK = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[6]/div/input"));
    public static final Target NOMBRE_TURCO = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[7]/div/input"));
    public static final Target NOMBRE_FRANCES = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[8]/div/input"));
    public static final Target NOMBRE_ESPANOL = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[9]/div/input"));
    public static final Target NOMBRE_ALEMAN = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[10]/div/input"));
    public static final Target BOTON_AGREGAR = Target.the("agregar").located(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/form/div[3]/button[2]"));
    public static final Target RESPUESTA = Target.the("Extraer la respuesta").located(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]"));









}
