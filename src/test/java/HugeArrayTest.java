import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.anseranser.Main.getTwoMinSum;

public class HugeArrayTest {

    @Test
    void testOneHundredMillionsArray() {
        int[] array = new int[100_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertEquals(1, getTwoMinSum(array));
    }
}
