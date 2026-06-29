class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for (int i =0;i< row;i++){
            for (int j =0;j< col;j++){
                if (matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for(int i = 0; i< row;i++){
            for(int j = 0;j< col;j++){
                if (rowSet.contains(i) || colSet.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}