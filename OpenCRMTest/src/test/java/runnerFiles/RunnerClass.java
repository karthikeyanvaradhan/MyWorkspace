package runnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\vkarthikeyan\\workspace\\OpenCRMTest\\src\\test\\resources\\FeatureFiles\\OpenCRM.feature", glue = {
				"C:\\Users\\vkarthikeyan\\workspace\\OpenCRMTest\\src\\test\\java\\runnerFiles\\RunnerClass.java" })

public class RunnerClass {

}
