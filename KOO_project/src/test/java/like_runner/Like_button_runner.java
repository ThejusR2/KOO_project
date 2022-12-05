package like_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/like/Like.feature"},glue= {"Like_button_definition.java"})
public class Like_button_runner extends AbstractTestNGCucumberTests  {
	
}
