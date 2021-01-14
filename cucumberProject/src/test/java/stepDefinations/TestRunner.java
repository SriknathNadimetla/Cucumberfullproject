package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
features="src/test/resources/Feature",glue= {"stepDefinations"},
monochrome = true,
//plugin= {"pretty","html:target/JunitReport/HtmlReports"} 		
//plugin= {"pretty","json:target/JsonReports/report.json"} 
plugin= {"pretty","junit:target/JunitReports/report.xml"}, 		
tags="@smoke"

)


public class TestRunner {

	
}
