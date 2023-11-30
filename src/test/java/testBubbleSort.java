package src.test.java;
import org.junit.Test;
import src.main.java.bubbleSort;

public class testBubbleSort {
    private bubbleSort BubbleSort;

    @Test
    public void testBS() {
        BubbleSort = new bubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int[] rs = BubbleSort.sort(arr);
        System.out.println("Sorted array: " + rs);
    }
}

