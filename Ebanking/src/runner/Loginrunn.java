package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\EvngBatch\\Ebanking\\src\\features\\Login.feature",
                 glue="stepdefination",monochrome=true)
public class Loginrunn 
{

}