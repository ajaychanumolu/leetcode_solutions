class Solution {
    public void rotate(int[][] matrix) {
int i ,j ,temp;
        //transpose of the matrix 
        for( i=0;i<matrix.length;i++){
            for( j=0;j<i;j++){
                temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse each and every row 
        for( i = 0 ; i < matrix.length ; i++){
            for(j = 0 ; j< matrix[0].length/2;j++ ){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][ matrix[0].length-j-1];
                matrix[i][ matrix[0].length-j-1] = temp;
            }
        }
        
    }
}