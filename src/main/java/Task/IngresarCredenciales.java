package Task;

import UI.PageHomeWikipedia;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;
import java.util.Map;

public class IngresarCredenciales {

    public static DataTable data;


    public IngresarCredenciales(DataTable data) {
        this.data = data;
    }

    public static Performable Login(DataTable data)
    {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);
       return Task.where(actor -> {

           actor.attemptsTo(Click.on(PageHomeWikipedia.BOTON_OPCIONES));
           actor.attemptsTo(Click.on(PageHomeWikipedia.BOTON_OPCION_LOGIN));
           actor.attemptsTo(SendKeys.of(String.valueOf(values.get(0).get("User"))).into(PageHomeWikipedia.CAMPO_USUARIO));
           actor.attemptsTo(Enter.theValue(String.valueOf(values.get(0).get("Password"))).into(PageHomeWikipedia.CAMPO_PASSWORD));
           actor.attemptsTo(Click.on(PageHomeWikipedia.BOTON_LOGUIN));

           actor.remember("usuario",String.valueOf(values.get(0).get("User")));



       });



    }



}
