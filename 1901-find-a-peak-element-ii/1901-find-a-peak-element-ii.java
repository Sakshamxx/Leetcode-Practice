class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int lo = 0;
        int hi = m-1;
        while( lo <= hi){
            int mid = lo + (hi-lo)/2;
            int maxRow = maxFn(mat, n, mid);
            int left = mid > 0 ? mat[maxRow][mid - 1] : -1; 
            int right = mid + 1 < m ? mat[maxRow][mid + 1] : -1; 
            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right){
                return new int[]{maxRow, mid};
            }else if( mat[maxRow][mid] < left){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return new int[]{-1,-1} ;
    }
    public int maxFn(int[][] mat, int n, int mid){
        int maxVal = Integer.MIN_VALUE;;
        int ind = Integer.MIN_VALUE;;
        for (int i = 0;i<n;i++){
            if (mat[i][mid] > maxVal){
            maxVal = mat[i][mid];
            ind = i;
            }
        }
        return ind;
    }
}