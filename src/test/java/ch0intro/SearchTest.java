package ch0intro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.testng.annotations.Test;

public class SearchTest {

    @Test
    public void testFindHighest() {
        Search search = new Search();

        int[] numbers = new int[] { 4, 5, 12, 0, 2, 5, 7, 8, 1, 1 };
        int actual = search.findHighest( numbers );
        assertThat( actual, is( equalTo( 12 ) ) );

        numbers = new int[] { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5 };
        actual = search.findHighest( numbers );
        assertThat( actual, is( equalTo( 5 ) ) );

        numbers = new int[] { -5, -4, -3, -2 - 1, 0, 1};
        actual = search.findHighest( numbers );
        assertThat( actual, is( equalTo( 1 ) ) );
    }

    @Test
    public void testFindLowest() {
        Search search = new Search();

        int[] numbers = new int[] { 4, 5, 12, 0, 2, 5, 7, 8, 1, 1 };
        int actual = search.findLowest( numbers );
        assertThat( actual, is( equalTo( 0 ) ) );

        numbers = new int[] { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5 };
        actual = search.findLowest( numbers );
        assertThat( actual, is( equalTo( 1 ) ) );

        numbers = new int[] { -5, -4, -3, -2 - 1, 0, 1};
        actual = search.findLowest( numbers );
        assertThat( actual, is( equalTo( -5 ) ) );
    }
}
