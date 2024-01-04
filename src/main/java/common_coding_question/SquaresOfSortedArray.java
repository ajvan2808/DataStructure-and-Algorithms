package common_coding_question;


/**
* Given an integer array nums sorted in non-decreasing order,
* return an array of the squares of each number sorted in non-decreasing order.
* Input: nums = [-4,-1,0,3,10]
* Output: [0,1,9,16,100]
**/
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] numsArr) {
        for (int i = 0; i < numsArr.length ; i++) {
            numsArr[i] *= numsArr[i];
        }
        // bubble sort
        for (int y = 0; y < (numsArr.length) - 1; y++) {
            for (int z = 0; z < (numsArr.length) - y -1; z++) {
                if (numsArr[z] > numsArr[z+1]) {
                    int temp = numsArr[z];
                    numsArr[z] = numsArr[z+1];
                    numsArr[z+1] = temp;
                }

            }
        }

        // another implementation of bubble sort that can leverage runtime
//        for(int i=0;i<nums.length;i++)
//        {
//            int num = nums[i];
//            int j = i-1;
//            while(j>=0&&num<nums[j])
//            {
//                nums[j+1]=nums[j];
//                j=j-1;
//            }
//            nums[j+1]=num;
//        }
        return numsArr;
    }
}
