package y2021.m10.d20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void basicTests() {
        doTest(new int[]{1, 2, 3}, new int[]{0, 2});
        doTest(new int[]{1234, 5678, 9012}, new int[]{1, 2});
        doTest(new int[]{2, 2, 3}, new int[]{0, 1});
    }

    private void doTest(int[] numbers, int[] expected) {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = Solution.twoSum(numbers, target);

        assertNotNull(actual, "Received a null \n");
        assertEquals(2, actual.length, "Received an array that's not of length 2\n");

        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }
}