package reto.phptravels.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import reto.phptravels.userintefaces.RegistroCategoriaBlog;

public class Pregunta implements Question<Boolean> {

    private String question;
    public Pregunta(String question) {
        this.question = question;
    }


    public static Pregunta res(String questions) {
        return new Pregunta(questions);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String textName= Text.of(RegistroCategoriaBlog.RESPUESTA).viewedBy(actor).asString();
        if(question.equals(textName)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}
