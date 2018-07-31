package ch0intro;

import org.testng.annotations.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.*;

public class MathOperationsTest {

    private final int maxIterations = 10;
    private final Random random = new Random();

    @Test
    public void testAddReturnsSumOfTwoNumbers() {
        MathOperations ops = new MathOperations();

        for (int i = 0; i < maxIterations; i++) {
            int n1 = random.nextInt();
            int n2 = random.nextInt();
            int sum = ops.sum(n1, n2);
            assertThat(n1 + " plus " + n2, sum, is(n1 + n2));
        }
    }

    @Test
    public void testMinusReturnsDifferenceOfTwoNumbers() {
        MathOperations ops = new MathOperations();

        for (int i = 0; i < maxIterations; i++) {
            int n1 = random.nextInt();
            int n2 = random.nextInt();
            int difference = ops.minus(n1, n2);
            assertThat(n1 + " plus " + n2, difference, is(n1 - n2));
        }
    }

    @Test
    public void testMultiplyReturnsProductOfTwoNumbers() {
        MathOperations ops = new MathOperations();

        for (int i = 0; i < maxIterations; i++) {
            int n1 = random.nextInt();
            int n2 = random.nextInt();
            int product = ops.multiply(n1, n2);
            assertThat(n1 + " times " + n2, product, is(n1 * n2));
        }
    }

    @Test
    public void testDivideReturnsQuotientOfTwoNumbers() {
        MathOperations ops = new MathOperations();

        for (int i = 0; i < maxIterations; i++) {
            double n1 = random.nextDouble();
            double n2 = random.nextDouble();
            double quotient = ops.divide(n1, n2);
            assertThat(n1 + " divide " + n2, quotient, is(n1 / n2));
        }
    }
}