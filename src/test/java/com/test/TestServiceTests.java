package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


@QuarkusTest
public class TestServiceTests {

    @ParameterizedTest
    @CsvSource({"test,TEST", "Test,TEST", "TEST,TEST"})
    void toUpperCase_convertsStringToUpper(String input, String expected) {
        var service = new TestService();
        String actualValue = service.toUpperCase(input);
        Assertions.assertEquals(expected, actualValue);
    }
}
