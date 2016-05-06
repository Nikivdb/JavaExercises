package be.cegeka.fibonacci;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void fibonacci_isNotDefinedForNegativeNumbers() {
        new Fibonacci().findNumberAtPosition(-1);
    }

    @Test
    public void fibonacci_firstNumberIsZero() {
        assertEquals(new Fibonacci().findNumberAtPosition(1), 0);
    }

    @Test
    public void fibonacci_secondNumberIsOne() {
        assertEquals(new Fibonacci().findNumberAtPosition(2), 1);
    }

    @Test
    public void fibonacci_thirdNumberIsOne() {
        assertEquals(new Fibonacci().findNumberAtPosition(3), 1);
    }

    @Test
    public void fibonacci_tenthNumberIsThirthyFour() {
        assertEquals(new Fibonacci().findNumberAtPosition(10), 34);
    }

    @Test
    public void fibonacci_fiftheenthNumberIsThreehundrenAndSeventySeven() {
        assertEquals(new Fibonacci().findNumberAtPosition(15), 377);
    }

}