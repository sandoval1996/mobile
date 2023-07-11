package Stepdefinitions;


import Question.ValidarInicioSesionExitoso;
import Task.IngresarCredenciales;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepdefinitions {

    @Managed

    WebDriver Dispositivos;

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jhon").can(BrowseTheWeb.with(Dispositivos));


    }


    @Dado("Ingreso las credenciales de inicio sesion")
    public void ingresoLasCredencialesDeInicioSesion(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCredenciales.Login(dataTable));

    }

    @Entonces("valido el inicio sesion exitoso")
    public void validoElInicioSesionExitoso() {

        OnStage.theActorInTheSpotlight().should(seeThat(ValidarInicioSesionExitoso.con()));

    }





}
