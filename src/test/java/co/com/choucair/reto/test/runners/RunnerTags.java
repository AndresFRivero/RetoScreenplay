package co.com.choucair.reto.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/retoChoucair.feature",
        tags = "@stories",
        glue = "co.com.choucair.reto.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
