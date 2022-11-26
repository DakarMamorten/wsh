package edu.wsh;

import edu.wsh.firstyear.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void if_add_correct_numbers_than_return_sum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
}