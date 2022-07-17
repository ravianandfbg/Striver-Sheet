// Time : O(N^2)
// Space : O(1)

class Solution {
      public int maxProfit(int[] prices) {
          int max = 0;
          for(int i = 0 ; i < prices.length ; i++){
              for(int j = i+1 ; j < prices.length ; j++){
                  if(prices[j] > prices[i]){
                      max = Math.max(prices[j] - prices[i] , max);
                  }
              }
          }
          
          return max;
      }
  }