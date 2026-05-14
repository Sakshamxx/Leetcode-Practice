package Developer_Docs;

import  java.util.Arrays;

public class Move_Zeroes {

    public static void moveZeroes(int[] nums) {

        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before:");
        System.out.println(Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println("After:");
        System.out.println(Arrays.toString(nums));
    }
}
	
