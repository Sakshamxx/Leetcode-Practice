package Developer_Docs;

public class Maximum_Subarray_sum {
    public static void main(String[] args) {
        int[] arr = {3,2,-11,4,-1,5};
        System.out.println(maxSubArray(arr));
    }

    // Kadens Algorithm
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans=Math.max(ans, sum);
            if (sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
