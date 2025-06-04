package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    int[] testArray = {2, 4, 6, 8, 10};

    @Test
    public void testCalculateSum() {
        assertEquals(30, App.calculateSum(testArray));
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(6.0, App.calculateAverage(testArray), 0.001);
    }

    @Test
    public void testFindMin() {
        assertEquals(2, App.findMin(testArray));
    }

    @Test
    public void testFindMax() {
        assertEquals(10, App.findMax(testArray));
    }

    @Test
    public void testEmptyArrayAverage() {
        assertEquals(0.0, App.calculateAverage(new int[] {}), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinWithEmptyArray() {
        App.findMin(new int[] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        App.findMax(new int[] {});
    }
}
