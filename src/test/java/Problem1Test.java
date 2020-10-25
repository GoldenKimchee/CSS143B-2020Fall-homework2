import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// DO NOT REMOVE OR CHANGE ANYTHING HERE!
public class Problem1Test {
    @Test
    public void testSortColor() {
        int[][] inputs = {
                null, // This addition of null and
                {},   //an empty list test case has been approved on discord
                {0, 1, 2},
                {2, 1, 0},
                {0, 1, 2},
                {2, 0, 1},
                {2, 2, 1, 1, 0},
                {2, 0, 1, 2, 0},
                {2, 2, 1, 1, 0, 0},
                {1, 2, 0, 1, 2, 0},
                {2, 0, 2, 1, 1, 0},
        };

        int[][] expects = {
                null,   // Expect cases were
                {},     //approved by professor
                {0, 1, 2},
                {0, 1, 2},
                {0, 1, 2},
                {0, 1, 2},
                {0, 1, 1, 2, 2},
                {0, 0, 1, 2, 2},
                {0, 0, 1, 1, 2, 2},
                {0, 0, 1, 1, 2, 2},
                {0, 0, 1, 1, 2, 2},
        };

        for (int i = 0; i < inputs.length; i++) {
            Problem1.colorSort(inputs[i]);
            assertArrayEquals("cases " + i + " failed", expects[i], inputs[i]);
        }
    }
}
