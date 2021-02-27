package reto.phptravels.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.SendKeys;

import reto.phptravels.userintefaces.RegistroPostPagina;
import reto.phptravels.util.Wait;

import static reto.phptravels.userintefaces.RegistroPostPagina.IFRAME;

public class RegistroPost implements Task {

    private String titulo,link,mensaje,palabras,descripcion,selectestado,selectcategoria,relations;

    public RegistroPost(String titulo, String link, String mensaje, String palabras, String descripcion, String selectestado, String selectcategoria, String relations) {
        this.titulo = titulo;
        this.link = link;
        this.mensaje = mensaje;
        this.palabras = palabras;
        this.descripcion = descripcion;
        this.selectestado = selectestado;
        this.selectcategoria = selectcategoria;
        this.relations = relations;
    }

    public static RegistroPost Pagina(String titulo, String link, String mensaje, String palabras, String descripcion, String selectestado, String selectcategoria, String relations) {
        return Tasks.instrumented(RegistroPost.class, titulo,link,mensaje,palabras,descripcion,selectestado,selectcategoria,relations);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                Click.on(RegistroPostPagina.BLOG),
                Click.on(RegistroPostPagina.POST),
                Click.on(RegistroPostPagina.BOTON_ANADIR),
                Enter.theValue(titulo).into(RegistroPostPagina.TITULO),
                Enter.theValue(link).into(RegistroPostPagina.LINK),
                Wait.por(10000));
                BrowseTheWeb.as(actor).getDriver().switchTo().frame(IFRAME.resolveFor(actor));
        actor.attemptsTo(
                Click.on(RegistroPostPagina.TEXTO2),
                Enter.theValue(mensaje).into(RegistroPostPagina.TEXTO2));

                 BrowseTheWeb.as(actor).getDriver().switchTo().parentFrame();

        actor.attemptsTo(

                Enter.theValue(palabras).into(RegistroPostPagina.PALABRAS_CLAVES),
                Enter.theValue(descripcion).into(RegistroPostPagina.DESCRIPCION),
                SelectFromOptions.byVisibleText(selectestado).from(RegistroPostPagina.SELECCIONAR_ESTADO),
                SelectFromOptions.byVisibleText(selectcategoria).from(RegistroPostPagina.SELECCIONAR_CATEGORIA),
                Enter.theValue(relations).into(RegistroPostPagina.RELATIONS),
                SendKeys.of("C:\\reto\\src\\main\\java\\reto\\phptravels\\tasks\\yi.png").into(RegistroPostPagina.CARGAR_IMG)

                );
    }
}
