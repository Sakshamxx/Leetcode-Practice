package Developer_Docs;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int majority = nums.length / 2;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > majority) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }
}
