// ti,e : O(log N)
// Space : O(1)

class Solution {
      public double myPow(double x, int n) {
          double ans = 1.0;
          long xn = n;
          
          if(xn < 0){
              xn = -1 * xn;
          }
          
          while(xn > 0){
              if(xn % 2 == 1){
                  ans = ans * x;
                  xn = xn - 1;
              }
              else{
                  x = x * x;
                  xn = xn / 2;
              }
          }
          
          if(n < 0){
              ans = (double)(1.0) / (double)(ans);
          }
          
          return ans;
      }
  }  