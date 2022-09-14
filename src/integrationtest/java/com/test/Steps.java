package com.example;

import com.example.TestService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;
import java.util.Map;
import java.util.stream.Collectors;

public class Steps {

    @Inject
    TestService service;

    Map<String, String> convertedValues;

    @When("I pass the values to the toUpper method")
    public void i_pass_the_values_to_the_to_upper_method(io.cucumber.datatable.DataTable dataTable) {
        convertedValues = dataTable.asList().stream()
                .collect(Collectors.toMap(x -> x, x -> service.toUpperCase(x)));
    }

    @Then("the values are converted to upper case")
    public void the_value_is_converted_to_upper_case() {
        convertedValues.forEach((k, v) -> {
            Assertions.assertEquals(k.toUpperCase(), v);
        });
    }
}
