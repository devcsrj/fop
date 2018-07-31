package ch0intro;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.*;

public class StarTest {

    @Test
    public void testPyramid() {

        String expected = "*" +
                "**" +
                "***" +
                "****" +
                "*****" +
                "******" +
                "*******";

        Star star = new Star();
        String actual = star.pyramid(7);

        assertThat(actual, is(expected));
    }

    @Test
    public void testPyramidAgain() {

        String expected = "*" +
                "**" +
                "***";

        Star star = new Star();
        String actual = star.pyramid(3);

        assertThat(actual, is(expected));
    }

    @Test
    public void testInvertedPyramid() {
        String expected = "***" +
                "**" +
                "*";

        Star star = new Star();
        String actual = star.invertedPyramid(3);

        assertThat(actual, is(expected));
    }

    @Test
    public void testInvertedPyramidAgain() {
        String expected = "*******" +
                "******" +
                "*****" +
                "****" +
                "***" +
                "**" +
                "*";

        Star star = new Star();
        String actual = star.invertedPyramid(7);

        assertThat(actual, is(expected));
    }

}