class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fstcolzero = false;
        boolean fstrowzero = false;

        // Check if first column needs to be zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                fstcolzero = true;
            }
        }

        // Check if first row needs to be zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                fstrowzero = true;
            }
        }

        // Setting indicators in the first row and first column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {  // FIXED CONDITION
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Updating matrix based on indicators
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {  // FIXED CONDITION
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Setting first column to zero if needed
        if (fstcolzero) {  // FIXED VARIABLE NAME
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        // Setting first row to zero if needed
        if (fstrowzero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
