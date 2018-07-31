package ch0intro;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This class is a test class for the "About" class.
 * <p>
 * You can run this class by clicking the triangular icon in the
 * gutter (where the line numbers are).
 * <p>
 * <--------- There's a run icon beside "public"
 */
public class AboutTest {

    /**
     * When running this test class, you'll notice at first that it "fails",
     * the console shows RED. Scrolling up the console should show a message similar to:
     * <pre>
     *
     *  java.lang.AssertionError:
     *  Expected: is "Welcome, Programmer"
     *      but: was null
     *
     *  at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)
     *  at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)
     *  ...
     * </pre>
     *
     * Your goal is to make this go GREEN. Green indicates that the test case is passing.
     *
     * In this particular case, it requires that the method "printHello" from the "About"
     * class should return "Welcome, " plus the name passed as parameter. For example
     * <pre></pre>
     *     about.printHello("abc"); // should return "Hello, abc"
     *     about.printHello("Van"); // should return "Hello, Van"
     *     about.printHello("Von"); // should return "Hello, Von"
     * </pre>
     * You must update "About" class such that it follows the required behavior.
     */
    @Test
    public void testItPrintsHelloName() {
        About about = new About();

        // Tip: You can Ctrl+Click the "printHello" method here, to go to the method that needs to be fixed
        String actual = about.printHello("Programmer");
        assertThat(actual, is("Welcome, Programmer"));

        actual = about.printHello("RJ");
        assertThat(actual, is("Welcome, RJ"));
    }
}
