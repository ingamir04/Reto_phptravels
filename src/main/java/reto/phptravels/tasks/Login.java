package reto.phptravels.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.phptravels.userintefaces.LoginPagina;

import javax.security.auth.login.LoginContext;
import java.util.List;

public class Login implements Task {
    private String email,clave;

    public Login(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    public static Login pagina(String email, String clave) {
        return Tasks.instrumented(Login.class, email, clave);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(email).into(LoginPagina.EMAIL),
                Enter.theValue(clave).into(LoginPagina.CLAVE),
                Click.on(LoginPagina.BOTON_ACCESO)
        );
    }
}
