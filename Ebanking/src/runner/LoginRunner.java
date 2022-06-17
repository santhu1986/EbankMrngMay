package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\EvngBatch\\Ebanking\\src\\features\\Rolecreation.feature",
		                   "D:\\EvngBatch\\Ebanking\\src\\features\\Login.feature"},glue="stepdefination",monochrome=true,
                  plugin= {"pretty","json:Target/Role/Rolecreation.json"})
public class LoginRunner 
{

}