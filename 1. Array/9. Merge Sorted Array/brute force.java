// time : O(n*log(n))+O(n)+O(n)
// space : O(n)

class Solution {
      public void merge(int[] nums1, int m, int[] nums2, int n) {
          int[] nums3 = new int[m + n];
          int k = 0;
          
          for(int i = 0 ; i < m ; i++){
              nums3[k++] = nums1[i];
          }
          
          for(int i = 0 ; i < n ; i++){
              nums3[k++] = nums2[i];
          }
          
          Arrays.sort(nums3);
          k = 0;
          
          for(int i = 0 ; i < m ; i++){
              nums1[i] = nums3[k++];
          }
          
          for(int i = 0 ; i < n ; i++){
              nums2[i] = nums3[k++];
          }
      }
  }