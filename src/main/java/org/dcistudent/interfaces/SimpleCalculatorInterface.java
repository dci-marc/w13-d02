package org.dcistudent.interfaces;

/**
 * SimpleCalculator interface for basic arithmetic operations.
 * Developers are expected to implement the methods to perform
 * addition, subtraction, multiplication, and division.
 */
public interface SimpleCalculatorInterface {
    /**
     * Adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    int add(int a, int b);

    /**
     * Subtracts the second integer from the first and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of a - b
     */
    int subtract(int a, int b);

    /**
     * Multiplies two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    int multiply(int a, int b);

    /**
     * Divides the first integer by the second and returns the result as a double.
     * Implementations should handle division by zero by throwing an ArithmeticException.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the result of a / b
     * @throws ArithmeticException if b is zero
     */
    double divide(int a, int b) throws ArithmeticException;
}

