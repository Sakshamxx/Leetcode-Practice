class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for(int i = result.length - 1;i>=0;i--){
            int left_sq = nums[left]*nums[left];
            int right_sq = nums[right]*nums[right];

            if (left_sq > right_sq){
                result[i] = left_sq;
                left++;
            }else{
                result[i] = right_sq;
                right--;
            }
        }
        return result;
    }
}