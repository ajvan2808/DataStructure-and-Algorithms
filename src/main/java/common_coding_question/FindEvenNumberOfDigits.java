package common_coding_question;

// Given an array nums of integers i.e [12,345,2,6,7896], return how many of them contain an even number of digits.
public class FindEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            int num_len = Integer.toString(i).length();
            if (num_len % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
