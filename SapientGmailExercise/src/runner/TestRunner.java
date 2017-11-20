package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features", 
		glue={"stepDefinition"},
		plugin={"html:target/cucmber-html-report"}
		)
public class TestRunner {

}
