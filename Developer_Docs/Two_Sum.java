package Developer_Docs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = { 2, 9, 1, 4, 7 };
        int[] result = twoSum(nums, 6);
        System.out.println(Arrays.toString(result)); // [0, 2]
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No Match");
    }
}