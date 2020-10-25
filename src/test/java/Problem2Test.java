import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                null, // This addition of null and
                {},   //an empty list test case has been approved on discord
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                {1, 2, 4, 5, 5, 8, 9, 10, 10},
                {5, 7, 7, 7, 9, 9, 10, 11, 12, 12},
                {10, 20, 30, 30, 40, 40, 40, 40},
                {},
                {2},
                {1, 1, 1}
        };

        int[][] expects = {
                {},  // Expect cases were
                {},  //approved by professor
                {0, 1, 2, 4, 6},
                {1, 2, 4, 5, 8, 9, 10},
                {5, 7, 9, 10, 11, 12},
                {10, 20, 30, 40},
                {},
                {2},
                {1}
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
