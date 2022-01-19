package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.fail;

public class ExampleTest {
    @Test
    void shouldShowSimpleAssertion() {

        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("")
    void methodName() {
        
        fail("Not implemented Yet");
    }
}
