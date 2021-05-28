package Com.Test.Ekansh.Runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/resources/FeatureFiles/", glue = "Com.Test.Ekansh.StepDefinitions", tags = {"@UpdateInformation"})

public class TestRunner extends AbstractTestNGCucumberTests
{
	Initializer obj=new Initializer();
	
	
	@BeforeClass
	public void intiateSession() {
		obj.initializeBrowser();
	}

	@AfterClass
	public void closeSession() {
		obj.closeSession();
	}
}