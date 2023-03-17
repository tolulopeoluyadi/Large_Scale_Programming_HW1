package org.howard.edu.lsp.midterm.problem51;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class IntegerRangeTest {
    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        Range range = new IntegerRange(1, 10);

        assertTrue(range.contains(1));
        assertTrue(range.contains(5));
        assertTrue(range.contains(10));

        assertFalse(range.contains(0));
        assertFalse(range.contains(11));
    }

    @Test
    @DisplayName("Test case for overlaps")
    public void testOverlaps() throws EmptyException {
        Range range1 = new IntegerRange(1, 10);
        Range range2 = new IntegerRange(5, 15);
        Range range3 = new IntegerRange(11, 20);
        Range range4 = new IntegerRange(20, 30);

        assertTrue(range1.overlaps(range2));
        assertTrue(range2.overlaps(range1));

        assertFalse(range1.overlaps(range3));
        assertFalse(range3.overlaps(range1));

        assertFalse(range1.overlaps(range4));
        assertFalse(range4.overlaps(range1));

    }

    @Test
    @DisplayName("Test case for size")
    public void testSize() {
        Range range = new IntegerRange(1, 10);

        assertEquals(10, range.size());
    }
}
