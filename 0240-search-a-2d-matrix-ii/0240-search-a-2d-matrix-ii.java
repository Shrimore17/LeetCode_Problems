class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int m = 0;
          int n = matrix[0].length - 1;

          while(m < matrix.length && n >= 0){
            int val = matrix[m][n];

            if (val == target){
                return true;
            }
            else if(val > target){
                      n--;
            }
            else {
                m++;
            }

           }
           return false;
        
    }
}