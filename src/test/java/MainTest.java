import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.anseranser.Main.getTwoMinSum;

class MainTest {

    @Test
    void testGetTwoMinSumWithNullArray() {
        assertEquals(0, getTwoMinSum(null));
    }

    @Test
    void testGetTwoMinSumWithEmptyArray() {
        assertEquals(0, getTwoMinSum(new int[]{}));
    }

    @Test
    void testGetTwoMinSumWithSingleElementArray() {
        assertEquals(5, getTwoMinSum(new int[]{5}));
    }

    @Test
    void testGetTwoMinSumWithTwoElementArray() {
        assertEquals(3, getTwoMinSum(new int[]{1, 2}));
    }

    @Test
    void testGetTwoMinSumWithMultipleElements() {
        assertEquals(3, getTwoMinSum(new int[]{5, 3, 1, 2, 4}));
    }

    @Test
    void testGetTwoMinSumWithNegativeNumbers() {
        assertEquals(-5, getTwoMinSum(new int[]{-2, -3, 0, 1, 4}));
    }

    @Test
    void testGetTwoMinSumWithDuplicateMinimums() {
        assertEquals(2, getTwoMinSum(new int[]{1, 1, 3, 4, 5}));
    }

    @Test
    void testGetTwoMinSumWithAllEqualElements() {
        assertEquals(6, getTwoMinSum(new int[]{3, 3, 3, 3}));
    }

    @Test
    void testGetTwoMinSumWithLargeNumbers() {
        assertEquals(Integer.MAX_VALUE + 1L, getTwoMinSum(new int[]{Integer.MAX_VALUE, 1, Integer.MAX_VALUE}));
    }
}
