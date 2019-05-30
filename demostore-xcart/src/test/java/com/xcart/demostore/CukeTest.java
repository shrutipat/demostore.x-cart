package com.xcart.demostore;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin ={"pretty", "html:target/cucumber-reports"},
        tags = "@NewSignUp, @Shopping",
        monochrome = true
)
public class CukeTest {
}
