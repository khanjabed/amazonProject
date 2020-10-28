package com.usa.dealrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"C:\\Users\\khanj\\eclipse-workspace\\AmazanChallenge2\\Feature\\Today'sdeal.feature"},
glue= {"com.usa.dealsteps"},
plugin={ "pretty", "html:target/cucumber-reports/cucumber.json",
"json:target/cucumber.json" },
monochrome=true,
dryRun=false,
strict=false
		)
public class AdealRunner extends AbstractTestNGCucumberTests{

}
