import org.junit.Assert;
import org.junit.Test;
import src.main.java.common_coding_question.simpleBST;

public class BSTTest {

    @Test
    public void testSubTree() {
        // Given 2 BST: write algorithm to check whether a tree is subtree of another or not
        simpleBST testTree1 = new simpleBST();
        simpleBST testTree2 = new simpleBST();

        testTree1.insert(1, "one");
        testTree1.insert(2, "two");
        testTree1.insert(3, "three");
        testTree1.insert(4, "four");
        testTree1.insert(5, "five");
        testTree1.insert(6, "six");

        testTree2.insert(4, "four");
        testTree2.insert(5, "five");
        testTree2.insert(6, "six");

        Assert.assertTrue(testTree1.isSubTree(testTree1, testTree2));
        Assert.assertEquals("456", testTree2.getOrder());
    }
}
