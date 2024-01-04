import common_coding_question.FindEvenNumberOfDigits;
import org.junit.Assert;
import org.junit.Test;

public class FindEvenNumberOfDigitsTest {
    private final FindEvenNumberOfDigits solution = new FindEvenNumberOfDigits();

    @Test
    public void findEvenNumbers() {
        int[] numsArr1 = new int[] {555,901,482,1771};
        int[] numsArr2 = new int[] {12,345,2,6,7896};

        Assert.assertEquals(1, solution.findNumbers(numsArr1));
        Assert.assertEquals(2, solution.findNumbers(numsArr2));
    }
}
