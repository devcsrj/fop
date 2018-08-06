package ch0intro;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StatisticsTest {

    @Test
    public void testComputeMean() {
        Statistics statistics = new Statistics();

        double[] grades = {96, 93, 85, 94, 80, 75, 80};
        double actual = statistics.computeMean(grades);
        assertThat("mean of: " + Arrays.toString(grades), actual, is(equalTo(86.14285714285714d)));
    }

    @Test
    public void testComputeMeanAgain() {
        Statistics statistics = new Statistics();

        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double actual = statistics.computeMean(numbers);
        assertThat("mean of: " + Arrays.toString(numbers), actual, is(equalTo(5d)));
    }

    @Test
    public void testComputeMeanOfZero() {
        Statistics statistics = new Statistics();

        double[] numbers = new double[0];
        double actual = statistics.computeMean(numbers);
        assertThat("mean of: " + Arrays.toString(numbers), actual, is(equalTo(0d)));
    }

    @Test
    public void testComputeMedianOfEvenNumberOfItems() {
        Statistics statistics = new Statistics();

        double[] grades = {75, 80, 80, 85, 89, 93, 94, 96};
        double actual = statistics.computeMedian(grades);
        assertThat("median of: " + Arrays.toString(grades), actual, is(equalTo(87d)));
    }

    @Test
    public void testComputeMedianOfOddNumberOfItems() {
        Statistics statistics = new Statistics();

        double[] grades = {75, 80, 80, 85, 93, 94, 96};
        double actual = statistics.computeMedian(grades);
        assertThat("median of: " + Arrays.toString(grades), actual, is(equalTo(85d)));
    }

    @Test
    public void testComputeMedianOfZero() {
        Statistics statistics = new Statistics();

        double[] numbers = new double[0];
        double actual = statistics.computeMedian(numbers);
        assertThat("mean of: " + Arrays.toString(numbers), actual, is(equalTo(0d)));
    }

    @Test
    public void testComputeMode() {
        Statistics statistics = new Statistics();

        double[] numbers = {13, 13, 13, 13, 14, 14, 16, 18, 21};
        double[] actual = statistics.computeMode(numbers);
        double[] expected = {13};
        assertThat("mode of: " + Arrays.toString(numbers), actual, is(expected));
    }

    @Test
    public void testComputeModeMultiple() {
        Statistics statistics = new Statistics();

        double[] numbers = {8, 9, 10, 10, 10, 11, 11, 11, 12, 13};
        double[] actual = statistics.computeMode(numbers);
        double[] expected = {10, 11};
        assertThat("mode of: " + Arrays.toString(numbers), actual, is(expected));
    }


    @Test
    public void testComputeModeOfZero() {
        Statistics statistics = new Statistics();

        double[] numbers = new double[0];
        double[] actual = statistics.computeMode( numbers );
        double[] expected = new double[0];
        assertThat( "mean of: " + Arrays.toString( numbers ), actual, is( expected ) );
    }

}
