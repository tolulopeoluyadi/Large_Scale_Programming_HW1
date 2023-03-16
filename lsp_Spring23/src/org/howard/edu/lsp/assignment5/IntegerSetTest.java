package org.howard.edu.lsp.assignment5;
import org.howard.edu.lsp.assignment5.IntegerSet;
import org.howard.edu.lsp.assignment5.IntegerSetException;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest {

    private IntegerSet set;

    @BeforeEach
    void setUp() {
        set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        assertTrue(set.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(set.contains(1));
        assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        assertEquals(3, set.largest());
    }

    @Test
    @DisplayName("Test case for largest with empty set")
    public void testLargestWithEmptySet() {
        assertThrows(IntegerSetException.class, () -> {
            IntegerSet emptySet = new IntegerSet();
            emptySet.largest();
        });
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for smallest with empty set")
    public void testSmallestWithEmptySet() {
        assertThrows(IntegerSetException.class, () -> {
            IntegerSet emptySet = new IntegerSet();
            emptySet.smallest();
        });
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set.add(4);
        assertEquals(4, set.length());
        assertTrue(set.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set.remove(2);
        assertEquals(2, set.length());
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set.union(set2);
        assertEquals(4, set.length());
        assertTrue(set.contains(4));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set.intersect(set2);
        assertEquals(2, set.length());
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set.diff(set2);
        assertEquals(1, set);
    }
}

