package common_coding_question;

// Given a binary array nums, return the maximum number of consecutive 1's in the array.
public class FindConsecutive {
    public int findMaxConsecutiveOnes(int[] numsArr) {
        int counter = 0;
        int maxConsecutive = 0;
        for (int j : numsArr) {
            if (j == 1) {
                counter++;
                if (counter > maxConsecutive) {
                    maxConsecutive = counter;
                }
            }
            else if(j == 0) {
                counter = 0;
            }
        }
        return maxConsecutive;
    }
}