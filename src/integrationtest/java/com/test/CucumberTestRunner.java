package com.example;

import io.quarkiverse.cucumber.CucumberOptions;
import io.quarkiverse.cucumber.CucumberQuarkusTest;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@CucumberOptions(
        features = { "classpath:/com/test" },
        glue = "com.example",
        plugin = {"pretty", "junit:build/reports/componenttest/cucumber-reports.xml"})
public class CucumberTestRunner extends CucumberQuarkusTest {
    public static void main(String[] args) {
        runMain(CucumberTestRunner.class, args);
    }
}
