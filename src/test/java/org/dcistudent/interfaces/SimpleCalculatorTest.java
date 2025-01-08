package org.dcistudent.interfaces;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SimpleCalculatorTest {
    @Test
    void testAddWithMock() {
        // Create a mock object for SimpleCalculator
        SimpleCalculatorInterface calculatorMock = Mockito.mock(SimpleCalculatorInterface.class);

        // Stub the add method to return a specific value
        when(calculatorMock.add(2, 3)).thenReturn(5);

        // Call the add method
        int result = calculatorMock.add(2, 3);

        // Verify the behavior and check the result
        assertEquals(5, result, "The add method should return 5 for inputs 2 and 3");

        // Verify that the method was called with specific arguments
        verify(calculatorMock).add(2, 3);
    }

    @Test
    void testSubtractWithMock() {
        // Create a mock object for SimpleCalculator
        SimpleCalculatorInterface calculatorMock = Mockito.mock(SimpleCalculatorInterface.class);

        // Stub the subtract method to return specific values
        when(calculatorMock.subtract(10, 5)).thenReturn(5);
        when(calculatorMock.subtract(5, 10)).thenReturn(-5);
        when(calculatorMock.subtract(0, 0)).thenReturn(0);

        // Call the subtract method with different arguments and verify results
        assertEquals(5, calculatorMock.subtract(10, 5), "10 - 5 should return 5");
        assertEquals(-5, calculatorMock.subtract(5, 10), "5 - 10 should return -5");
        assertEquals(0, calculatorMock.subtract(0, 0), "0 - 0 should return 0");

        // Verify that the method was called with specific arguments
        verify(calculatorMock).subtract(10, 5);
        verify(calculatorMock).subtract(5, 10);
        verify(calculatorMock).subtract(0, 0);
    }

    @Test
    void testMultiplyWithStub() {
        // Create a mock object for SimpleCalculator
        SimpleCalculatorInterface calculatorMock = Mockito.mock(SimpleCalculatorInterface.class);

        // Stub the multiply method
        when(calculatorMock.multiply(4, 5)).thenReturn(20);

        // Call the multiply method
        int result = calculatorMock.multiply(4, 5);

        // Verify the behavior and check the result
        assertEquals(20, result, "The multiply method should return 20 for inputs 4 and 5");

        // Verify that the method was called once
        verify(calculatorMock).multiply(4, 5);
    }

    @Test
    void testDivideWithStub() {
        // Create a mock object for SimpleCalculator
        SimpleCalculatorInterface calculatorMock = Mockito.mock(SimpleCalculatorInterface.class);

        // Stub the divide method
        when(calculatorMock.divide(10, 2)).thenReturn(5.0);
        when(calculatorMock.divide(10, 0)).thenThrow(new ArithmeticException("Division by zero"));

        // Test successful division
        assertEquals(5.0, calculatorMock.divide(10, 2), 0.0001, "10 divided by 2 should return 5.0");

        // Test division by zero
        assertThrows(ArithmeticException.class, () -> calculatorMock.divide(10, 0), "Division by zero should throw ArithmeticException");
    }
}
