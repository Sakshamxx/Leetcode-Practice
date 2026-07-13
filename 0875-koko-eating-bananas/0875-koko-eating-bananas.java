class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i =0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }

        // Main Binary Search to Minimize
        int lo = 1;
        int hi = max;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            long total = totalhour(piles, mid);
            if ( total <= h){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }
    // Helper Function
    static long totalhour(int[] piles, int mid){
        long total = 0;
        for(int i =0;i<piles.length;i++){
            total += (piles[i] + mid - 1)/ mid;
        }
        return total;
    }
}