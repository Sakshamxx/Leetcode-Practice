package Developer_Docs;

import java.util.HashMap;

public class Contains_Duplicate_II {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {

                map.put(nums[i], i);

            } else {

                int diff = Math.abs(map.get(nums[i]) - i);

                if (diff <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean ans = containsNearbyDuplicate(nums, k);

        System.out.println("Contains Nearby Duplicate: " + ans);
    }
}
