package edu.udg.caes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void twoAndThreeIsFive(){
        Calculator c = new Calculator();
        final long result = c.add(2, 3);
        assertEquals(result, 5L);
    }
    @Test
    public void twoAndZeroIsTwo(){
        Calculator c = new Calculator();
        final long result = c.add(2, 0);
        assertEquals(result, 2L);
    }
    @Test
    public void twoAndMinusTwoIsZero(){
        Calculator c = new Calculator();
        final long result = c.add(2, -2);
        assertEquals(result, 0L);
    }
    @Test
    public void threeMinusTwoIsOne(){
        Calculator c = new Calculator();
        final long result = c.subtract(3, 2);
        assertEquals(result, 1L);
    }
    @Test
    public void threeMinusThreeIsZero(){
        Calculator c = new Calculator();
        final long result = c.subtract(3, 3);
        assertEquals(result, 0L);
    }
    @Test
    public void threeMinusMinusThreeIsSix(){
        Calculator c = new Calculator();
        final long result = c.subtract(3, -3);
        assertEquals(result, 6L);
    }
    @Test
    public void threeXThreeIsNine(){
        Calculator c = new Calculator();
        final long result = c.multiply(3, 3);
        assertEquals(result, 9L);
    }
    @Test
    public void threeXZeroIsZero(){
        Calculator c = new Calculator();
        final long result = c.multiply(3, 0);
        assertEquals(result, 0L);
    }
    @Test
    public void threeXMinusThreeIsMinusNine(){
        Calculator c = new Calculator();
        final long result = c.multiply(3, -3);
        assertEquals(result, -9L);
    }
}
