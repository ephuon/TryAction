package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoverageTest {

    @Test
    void add_negativeA_throwsIllegalArgumentException() {
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.add(-1, 5));
    }

    @Test
    void add_negativeB_throwsIllegalArgumentException() {
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.add(5, -1));
    }

    @Test
    void add_overflow_throwsArithmeticException() {
        Main main = new Main();
        assertThrows(ArithmeticException.class, () -> main.add(Integer.MAX_VALUE, 1));
    }

    @Test
    void add_boundary_noOverflow() {
        Main main = new Main();
        int result = main.add(Integer.MAX_VALUE - 1, 1);
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    void add_zero_zero_returnsZero() {
        Main main = new Main();
        int result = main.add(0, 0);
        assertEquals(0, result);
    }
}