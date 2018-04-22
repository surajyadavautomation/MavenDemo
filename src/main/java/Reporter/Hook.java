package Reporter;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/feature"
        ,glue= "stepdef",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
                )

public class Hook {
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("src/main/java/Reporter/config.xml"));
    
    }
}
