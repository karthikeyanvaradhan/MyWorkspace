package RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "gmailLogin.Feature"
		,glue={"stepDefinition"},tags={"@smoke"}
		)

public class GmailRunner {

}
