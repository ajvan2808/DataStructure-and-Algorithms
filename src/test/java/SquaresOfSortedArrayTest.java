import common_coding_question.SquaresOfSortedArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SquaresOfSortedArrayTest {
    private final SquaresOfSortedArray solution = new SquaresOfSortedArray();

    @Test
    public void sortedArrayWithSquares() {
        int[] example1 = new int[] {-4,-1,0,3,10};
        int[] example2 = new int[] {-7,-3,2,3,11};

        int[] expectedOutput1 = new int[]{0,1,9,16,100};
        int[] expectedOutput2 = new int[]{4,9,9,49,121};

        int[] output1 = solution.sortedSquares(example1);
        int[] output2 = solution.sortedSquares(example2);

        Assert.assertTrue(Arrays.equals(expectedOutput1, output1));
        Assert.assertTrue(Arrays.equals(expectedOutput2, output2));
    }
}
