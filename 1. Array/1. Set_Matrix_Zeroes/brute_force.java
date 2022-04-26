// Time : O(N * M) + O(N + M)

class Solution {
      public void setZeroes(int[][] matrix) {
          int row = matrix.length;
          int col = matrix[0].length;
          
          for(int i = 0 ; i < row ; i++){
              for(int j = 0 ; j < col ; j++){
                  if(matrix[i][j] == 0){
                      
                      int idx = i - 1;
                      
                      while(idx >= 0){
                          if(matrix[idx][j] != 0){
                              matrix[idx][j] = -1;
                          }
                          idx--;
                      }
                      
                      idx = i + 1;
                      while(idx < row){
                          if(matrix[idx][j] != 0){
                              matrix[idx][j] = -1;
                          }
                          idx++;
                      }
                      
                      idx = j - 1;
                      while(idx >= 0){
                          if(matrix[i][idx] != 0){
                              matrix[i][idx] = -1;
                          }
                          idx--;
                      }
                      
                      idx = j + 1;
                      while(idx < col){
                          if(matrix[i][idx] != 0){
                              matrix[i][idx] = -1;
                          }
                          idx++;
                      }
                  }
              }
          }
          for(int i = 0 ; i < row ; i++){
              for(int j = 0 ; j < col ; j++){
                  if(matrix[i][j] <= 0){
                      matrix[i][j] = 0;
                  }
              }
          }
      }
  }