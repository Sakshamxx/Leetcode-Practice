package Developer_Docs;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 7, 8 };
        int target = 2;
        System.out.println("Index of Target should be: " + searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int mid;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
