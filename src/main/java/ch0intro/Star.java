package ch0intro;

public class Star {

    /**
     * Implement such that this method returns a star pyramid.
     *
     * A star pyramid is described by height:
     * <pre>
     *     *    - pyramid of height 1
     *
     *     *
     *     **   - pyramid of height 2
     *
     *     *
     *     **
     *     ***  - pyramid of height 3
     *
     *     ... and so on
     * </pre>
     *
     * The height indicates the maximum number of asterisks per line, and
     * the maximum total number of lines.
     *
     * @param height the height of the pyramid
     * @return the pyramid
     */
    public String pyramid(int height) {
        return "*";
    }

    /**
     * Implement such that this method returns an inverted star pyramid.
     *
     * An inverted star pyramid is described by height:
     * <pre>
     *     *    - inverted pyramid of height 1
     *
     *     **
     *     *    - inverted pyramid of height 2
     *
     *     ***
     *     **
     *     *    - inverted pyramid of height 3
     *
     *     ... and so on
     * </pre>
     *
     * The height indicates the maximum number of asterisks per line, and
     * the maximum total number of lines.
     *
     * @param height the height of the pyramid
     * @return the inverted pyramid
     */
    public String invertedPyramid(int height) {
        return "*";
    }
}
