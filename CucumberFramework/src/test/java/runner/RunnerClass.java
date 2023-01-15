package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".\\FeatureFile", 
glue = {"stepDefinitions","hooks"},
dryRun = false,
monochrome = true,
plugin = {"html:report/WebReport/report.html","json:report/JsonReport/jsonReport.json"},
tags = "@Hooks")

public class RunnerClass {

}
