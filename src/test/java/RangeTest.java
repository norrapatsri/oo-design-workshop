import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class RangeTest {
    @Test
    public void isStartWithInclusive() {
        Range range = new Range("[1,5]");

        boolean actualResult = range.isStartWithInclusive();

        assertTrue(actualResult);
    }
}
