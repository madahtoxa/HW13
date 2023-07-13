package com.example.hw13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import service.CalculatorService;

import java.util.stream.Stream;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService =new CalculatorService();

    static Stream<Arguments> dataForPlus() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(150, 50),
                Arguments.of(-50, 25),
                Arguments.of(-50, -50)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus(int n1,int  n2) {
        int expected = n1 + n2;
        Assertions.assertEquals(expected,calculatorService.plus(n1,n2));
    }
    static Stream<Arguments> dataForMinus() {
        return Stream.of(
                Arguments.of(10, 5),
                Arguments.of(150, 50),
                Arguments.of(-50, 25),
                Arguments.of(-50, -50)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMinus")
    void minus(int n1,int  n2) {
        int expected = n1 - n2;
        Assertions.assertEquals(expected,calculatorService.minus(n1,n2));
    }
    static Stream<Arguments> dataForMultiply() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(150, 50),
                Arguments.of(-50, 25),
                Arguments.of(-50, -50)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void multiply(int n1,int  n2) {
        int expected = n1 * n2;
        Assertions.assertEquals(expected,calculatorService.multiply(n1,n2));
    }
    static Stream<Arguments> dataForDivide() {
        return Stream.of(
                Arguments.of(10, 5),
                Arguments.of(150, 50),
                Arguments.of(-50, 25),
                Arguments.of(-50, -50)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForDivide")
    void divide(int n1,int  n2) throws Exception {
        int expected = n1 / n2;
        Assertions.assertEquals(expected,calculatorService.divide(n1,n2));
    }
}
