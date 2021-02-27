package reto.phptravels.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectOptions;
import reto.phptravels.userintefaces.RegistroCategoriaBlog;

public class RegistroBlog implements Task {


    private String categoria,estado,vietnan,ruso,arabe,irak,turco,frances,espanol,aleman;

    public RegistroBlog(String categoria, String estado, String vietnan, String ruso, String arabe, String irak, String turco, String frances, String espanol, String aleman) {
        this.categoria = categoria;
        this.estado = estado;
        this.vietnan = vietnan;
        this.ruso = ruso;
        this.arabe = arabe;
        this.irak = irak;
        this.turco = turco;
        this.frances = frances;
        this.espanol = espanol;
        this.aleman = aleman;
    }

    public static RegistroBlog Pagina(String categoria, String estado, String vietnan, String ruso, String arabe, String irak, String turco, String frances, String espanol, String aleman) {
        return Tasks.instrumented(RegistroBlog.class, categoria, estado,vietnan,ruso,arabe,irak,turco,frances,espanol,aleman);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroCategoriaBlog.BLOG),
                Click.on(RegistroCategoriaBlog.BLOG_CATEGORIA),
                Click.on(RegistroCategoriaBlog.BOTON_ANADIR),
                Enter.theValue(categoria).into(RegistroCategoriaBlog.ANADIR_CATEGORIA),
                SelectFromOptions.byVisibleText(estado).from(RegistroCategoriaBlog.SELECCIONAR_ESTADO),
                Enter.theValue(vietnan).into(RegistroCategoriaBlog.NOMBRE_VIETNA),
                Enter.theValue(ruso).into(RegistroCategoriaBlog.NOMBRE_RUSO),
                Enter.theValue(arabe).into(RegistroCategoriaBlog.NOMBRE_ARABE),
                Enter.theValue(irak).into(RegistroCategoriaBlog.NOMBRE_IRAK),
                Enter.theValue(turco).into(RegistroCategoriaBlog.NOMBRE_TURCO),
                Enter.theValue(frances).into(RegistroCategoriaBlog.NOMBRE_FRANCES),
                Enter.theValue(espanol).into(RegistroCategoriaBlog.NOMBRE_ESPANOL),
                Enter.theValue(aleman).into(RegistroCategoriaBlog.NOMBRE_ALEMAN),
                Click.on(RegistroCategoriaBlog.BOTON_AGREGAR)

                );
    }
}
