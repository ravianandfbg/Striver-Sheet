// time : O(N^2) + O(N^2)  first O(N^2) is for transpose  , second O(N^2) is for reverse
// Overall time : 2 * O(N^2) = O(N^2)
// space : O(1)

class Solution {
    public void rotate(int[][] matrix) {
        // transpose
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = i ; j < matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i = 0 ; i < matrix.length ; i++){
            int li = 0;
            int ri = matrix.length - 1;
            
            while(li < ri){
                int temp = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] = temp;
                
                li++;
                ri--;
            }
        }
    }
}