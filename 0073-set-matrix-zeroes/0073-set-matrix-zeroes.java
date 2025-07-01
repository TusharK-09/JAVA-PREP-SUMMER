class Solution {
    public void setZeroes(int[][] matrix) {
       
       int m = matrix.length;
       int n = matrix[0].length;

       boolean[] row_to_zero = new boolean[m];
       boolean[] col_to_zero = new boolean[n];

       //detect zero and marking
       for(int i=0; i < m; i++){
        for(int j=0; j < n; j++){
            if(matrix[i][j] == 0){
                row_to_zero[i] = true;
                col_to_zero[j] = true;
            }
        }
       }

       //marking the row zero first
       for(int i=0; i<m; i++){
        if(row_to_zero[i]){
            for(int j=0; j<n; j++){
                matrix[i][j] = 0;
            }
        }
       }

       //marking the column zero now
       for(int j=0; j<n; j++){
        if(col_to_zero[j]){
            for(int i=0; i<m; i++){
                matrix[i][j]=0;
            }
        }
       }
    }
}