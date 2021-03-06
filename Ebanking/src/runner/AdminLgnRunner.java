package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\EvngBatch\\Ebanking\\src\\features\\AdminLgn.feature",
		                    "D:\\EvngBatch\\Ebanking\\src\\features\\Role.feature"},
                             glue="stepdefination",monochrome=true,
                             plugin= {"pretty","json:Target/Roles/Rcreation.json"})
public class AdminLgnRunner
{

}
