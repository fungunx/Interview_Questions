package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt", // this is the connect feature files with runner class.
        //We need to copy path of resources folder as following: path from content root
        glue = "code/StepsDefinitions", //This is to connect stepsDefinitions with runner class
        //We need to copy path StepsDefinitions folder as following: path from source root
        tags = "@Regression", // This is the field that we will use insert tags
        dryRun = false, //This is to get Undefined steps without running scenarios
        plugin = {
                "pretty", //This will help us to have a more understandable console output
                "rerun:target/rerun.txt",
                "html:target/default-cucumber-reports.html",// We use this to generate HTML reports after each run
                "json:target/cucumber.json", //We use this to generate JSON reports after each run
        }
)

public class FailedRunner {
}