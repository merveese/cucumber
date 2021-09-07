package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//this will run feature files
//@Runwith is cucumber-junit annotation
//@co is used to add features, glue, plugins,tags,dryRUN.
// FEATURE=" path of feature folder AND glue" path of stepdef.
@RunWith(Cucumber.class)
@CucumberOptions(

        plugin={"html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features=".\\src\\test\\resources\\features",
        glue= "stepdefinitions",
        tags="@google_search",
        dryRun = false
        // we can puy just name of package because they are in same folder
)
public class Runner {

}
