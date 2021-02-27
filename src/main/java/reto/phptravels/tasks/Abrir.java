package reto.phptravels.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.phptravels.userintefaces.PhptravelsPagina;

public class Abrir implements Task {

    private PhptravelsPagina phptravelsPagina;
    public static Abrir pagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(phptravelsPagina));
    }
}
