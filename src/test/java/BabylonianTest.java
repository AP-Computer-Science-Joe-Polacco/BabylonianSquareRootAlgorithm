import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * The test class BabylonianTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BabylonianTest {
    @Test
    public void testSquareRoot() {
        Babylonian b = new Babylonian();
        // assertEquals(expected, actual, precision)
        assertEquals(10.000046356507898, b.squareRoot(100), 0.000000000001);
        assertEquals(3.162277660168379, b.squareRoot(10), 0.000000000001);
        assertEquals(22.504959637875427, b.squareRoot(500), 0.000000000001);
        assertEquals(32.72195679634224, b.squareRoot(999), 0.000000000001);

    }
}
