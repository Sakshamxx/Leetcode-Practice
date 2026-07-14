class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for (int j: nums){
            if (i<2 || j!=nums[i-2]){
                nums[i++] = j;
            }
        }
        return i;
    }
}