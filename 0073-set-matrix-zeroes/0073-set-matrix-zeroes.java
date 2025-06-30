class Solution {
    public void setZeroes(int[][] matrix) {
       
        ArrayList<Integer> row_pos =  new ArrayList<>();
        ArrayList<Integer> col_pos =  new ArrayList<>();
        int length = matrix.length;
        int elem ;
        int m = matrix.length;
        int n = matrix[0].length;

        //detecting the postion of zero element
        for(int i = 0;  i < m; i++){
            for(int j=0; j < n; j++){
                elem = matrix[i][j];

                if(elem == 0) {
                    row_pos.add(i);
                    col_pos.add(j);
                }
            }
        }

        //assigning zeros
        

            for(int i = 0;  i < m; i++){
            for(int j=0; j < n; j++){
               if(row_pos.contains(i) || col_pos.contains(j)){
                matrix[i][j] = 0;
               }
            }
        

        }



    }
}