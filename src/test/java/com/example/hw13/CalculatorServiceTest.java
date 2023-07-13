package com.example.hw13;


import org.junit.jupiter.api.Test;
import service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();


    @Test
    void plusPositive() {
        int actual = calculatorService.plus(10, 20);
        assertEquals(30, actual);
    }

    @Test
    void plusNegative() {
        int actual = calculatorService.plus(-10, -20);
        assertEquals(-30, actual);
    }

    @Test
    void minusPositive() {
        int actual = calculatorService.minus(20, 10);
        assertEquals(10, actual);
    }

    @Test
    void minusNegative() {
        int actual = calculatorService.minus(-10, -30);
        assertEquals(20, actual);
    }

    @Test
    void multiplyPositive() {
        int actual = calculatorService.multiply(5, 5);
        assertEquals(25, actual);
    }

    @Test
    void multiplyNegative() {
        int actual = calculatorService.multiply(5, -5);
        assertEquals(-25, actual);
    }

    @Test
    void dividePositive() throws Exception {
        int actual = calculatorService.divide(10, 5);
        assertEquals(2, actual);
    }

    @Test
    void divideNegative() throws Exception {
        int actual = calculatorService.divide(-10, 5);
        assertEquals(-2, actual);
    }
    @Test
    void divisionByZero(){
        assertThrows(Exception.class,()->calculatorService.divide(20,0));
    }
}
