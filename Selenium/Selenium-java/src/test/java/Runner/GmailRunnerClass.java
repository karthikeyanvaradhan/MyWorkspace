package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="gmail.feature",glue={"GmailRunnerClass.java")

public class GmailRunnerClass {

}
