package src.main.java.common_coding_question;
import org.junit.Assert;
import org.junit.Test;

public class ArrayAndStringsTest {
    private final uniqueCharacterDetector uniqueCharacter = new uniqueCharacterDetector();
    private final PermutationDetector permutationDetector = new PermutationDetector();

    private final URLConverter urlConverter = new URLConverter();
    private final OneAwayDetector oneAwayDetector = new OneAwayDetector();

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

    @Test
    public void URLify() {
        // Given length of final string
        // Replaces all the space in a string ASCII symbol for space '%20'
        Assert.assertEquals("My%20Home%20Page", urlConverter.urlify("My Home Page", 16));
    }

    @Test
    public void OneAwayDetect() {
        Assert.assertTrue(oneAwayDetector.oneAway("pale","ple"));
        Assert.assertTrue(oneAwayDetector.oneAway("pales","pale"));
        Assert.assertFalse(oneAwayDetector.oneAway("pales","bale"));
        Assert.assertFalse(oneAwayDetector.oneAway("pales","bae"));
    }
}