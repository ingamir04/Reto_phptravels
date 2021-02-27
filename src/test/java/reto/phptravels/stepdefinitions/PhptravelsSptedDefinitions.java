package reto.phptravels.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.phptravels.model.DataUser;
import reto.phptravels.questions.Pregunta;
import reto.phptravels.tasks.*;

import java.util.List;

public class PhptravelsSptedDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^Autentificarse ingresando usuario y clave$")
    public void autentificarseIngresandoUsuarioYClave(List<DataUser> dataUser) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Amir").wasAbleTo(Abrir.pagina(), Login.pagina(dataUser.get(0).getEmail(), dataUser.get(0).getClave()));
    }


    @When("^Registar cada uno de los datos para agregar una nueva categoria$")
    public void registarCadaUnoDeLosDatosParaAgregarUnaNuevaCategoria(List<DataUser> dataUser) throws Exception{
        // Write code here that turns the phrase above into concrete actions
       OnStage.theActorInTheSpotlight().attemptsTo(RegistroBlog.Pagina(dataUser.get(0).getCategoria(),dataUser.get(0).getEstado(),dataUser.get(0).getVietnan(),dataUser.get(0).getRuso(),dataUser.get(0).getArabe(),dataUser.get(0).getIrak(),dataUser.get(0).getTurco(),dataUser.get(0).getFrances(),dataUser.get(0).getEspanol(), dataUser.get(0).getAleman()));
    }

    @Then("^Verificar que se realizo el registro exitoso (.*)$")
    public void verificarQueSeRealizoElRegistroExitoso(String questions) {
        // Write code here that turns the phrase above into concrete actions
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Pregunta.res(questions)));
    }

    @When("^Crear un post con la categoria creada$")
    public void crearUnPostConLaCategoriaCreada(List<DataUser> dataUser) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroPost.Pagina(dataUser.get(0).getTitulo(), dataUser.get(0).getLink(),dataUser.get(0).getMensaje(),dataUser.get(0).getPalabras(),dataUser.get(0).getDescripcion(),dataUser.get(0).getSelectestado(),dataUser.get(0).getSelectcategoria(),dataUser.get(0).getRelations()));
    }

    @Then("^Test Passad$")
    public void testPassad() {
        // Write code here that turns the phrase above into concrete actions

    }

}
