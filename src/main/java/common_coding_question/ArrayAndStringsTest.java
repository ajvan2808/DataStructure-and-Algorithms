package src.main.java.common_coding_question;
import org.junit.Assert;
import org.junit.Test;

public class ArrayAndStringsTest {
    private final uniqueCharacterDetector uniqueCharacter = new uniqueCharacterDetector();
    private final PermutationDetector permutationDetector = new PermutationDetector();

    @Test
    public void UniqueCharacterDetect() {
        Assert.assertTrue(uniqueCharacter.isUnique("abcdfgh"));
        Assert.assertFalse(uniqueCharacter.isUnique("abcdfggh"));
    }

    @Test
    public void StringPermutationDetect() {
        // Given 2 strings, check if one is a permutation of the other
        Assert.assertTrue(permutationDetector.isPermutation("sunny", "ynnus"));
        Assert.assertFalse(permutationDetector.isPermutation("sunny", "hnah"));
    }

}