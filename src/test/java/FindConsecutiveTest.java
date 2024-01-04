import common_coding_question.FindConsecutive;
import org.junit.Assert;
import org.junit.Test;

public class FindConsecutiveTest {
    private final FindConsecutive solution = new FindConsecutive();
    @Test
    public void FindConsecutive(){
        int[] numsArray = new int[]{1, 1, 0, 1, 0, 0, 1, 1, 1};
        Assert.assertEquals(3, solution.findMaxConsecutiveOnes(numsArray));
    }
}
