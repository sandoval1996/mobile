package Question;

import UI.PageHomeWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidarInicioSesionExitoso  implements Question<Boolean> {





    @Override
    public Boolean answeredBy(Actor actor) {

        String perfil = actor.recall("usuario");

        actor.attemptsTo(Click.on(PageHomeWikipedia.BOTON_OPCIONES));
        actor.attemptsTo(Ensure.that(PageHomeWikipedia.TITULO).hasText(perfil));


        return true;
    }

    public static ValidarInicioSesionExitoso con ()
    {
        return new ValidarInicioSesionExitoso();
    }

}
