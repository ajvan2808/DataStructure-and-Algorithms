import common_coding_question.RansomNote;
import org.junit.Assert;
import org.junit.Test;

public class TestRansomNote {
    RansomNote checkCanFormNote = new RansomNote();

    @Test
    public void checkCanFormNote() {
        String note1 = "Pay";
        String letter1 = "yaP a";

        String note2 = "Pay di";
        String letter2 = "yaP a";

        Assert.assertTrue(checkCanFormNote.canWrite(note1, letter1));
        Assert.assertFalse(checkCanFormNote.canWrite(note2, letter2));
    }
}
