package com.usa.amazonrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features= {"Feature"},
glue= {"com.usa.amazonsteps"},
dryRun= false,
monochrome=true,
strict=true,
plugin={ "pretty", "html:target/cucumber-reports/cucumber.json",
"json:target/cucumber.json" }


		)
public class AmazonRunner extends AbstractTestNGCucumberTests {

}
