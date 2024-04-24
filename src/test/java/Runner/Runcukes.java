package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features", glue= {"Steps"},tags = "@Prod or @Testing and not @bvt" , plugin= {"html:target/cucumber-reports/cucumber-html-report.html"})
public class Runcukes extends AbstractTestNGCucumberTests {
	
	

}
