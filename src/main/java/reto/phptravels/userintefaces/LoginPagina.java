package reto.phptravels.userintefaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPagina {
    public static final Target EMAIL = Target.the("correo").located(By.xpath("/html/body/div[2]/form[1]/div[1]/label[1]/input"));
    public static final Target CLAVE = Target.the("clave").located(By.xpath("/html/body/div[2]/form[1]/div[1]/label[2]/input"));
    public static final Target BOTON_ACCESO = Target.the("boton").located(By.xpath("/html/body/div[2]/form[1]/button"));

}
