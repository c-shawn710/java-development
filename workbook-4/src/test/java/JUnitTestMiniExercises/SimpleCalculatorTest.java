package JUnitTestMiniExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addTwoNumbers_positiveNrs() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = simpleCalculator.addTwoNumbers(2, 4);
        assertEquals(6, result);
    }

    @Test
    void addTwoNumbers_negativeNrs() {
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.addTwoNumbers(-2, -4);
        // assert
        assertEquals(-6, result);

    }

    @Test
    void divideTwoNumbers_posNumbers() {
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(4, 2);
        // assert
        assertEquals(2, result);
    }

    @Test
    void divideTwoNumbers_posNegNumbers() {
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(-4, 2);
        // assert
        assertEquals(-2, result);
    }

    @Test
    void divideTwoNumbers_divByZero() {
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(4, 0);
        // assert
        assertEquals(0, result);
    }
}