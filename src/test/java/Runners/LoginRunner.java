package Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/Features/BuscarWikipedia.feature",
        glue = "Stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        plugin = {"pretty", "summary"}

)

public class LoginRunner {
}
