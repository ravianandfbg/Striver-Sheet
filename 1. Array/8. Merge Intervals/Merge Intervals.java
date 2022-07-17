// time : O(NlogN) + O(N)
// space : O(N)
// Pepcoding


class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        
        Arrays.sort(intervals , (a , b) -> {
            // 0 -> a = b
            // positive -> a > b
            // negative -> a < b
            
            return a[0] - b[0];
        });
        
        ans.add(intervals[0]);
        
        int i = 1;
        
        while(i < intervals.length){
            int li = ans.size() - 1;
            
            if(intervals[i][0] <= ans.get(li)[1]){
                // overlap
                ans.get(li)[1] = Math.max(intervals[i][1] , ans.get(li)[1]);
            }
            else{
                ans.add(intervals[i]);
                li++;
            }
            i++;
        }
        
        int[][] res = new int[ans.size()][2];
        res = ans.toArray(res);
        
        return res;
    }
}

//```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````


// class Solution {
//       public int[][] merge(int[][] intervals) {
//           List<int[]> res= new ArrayList<>();
//           if(intervals.length == 0 || intervals == null){
//               return res.toArray(new int[0][]);
//           }
          
//           Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
          
//           int start = intervals[0][0];
//           int end = intervals[0][1];
          
//           for(int[] i : intervals){
//               if(i[0] <= end){
//                   end = Math.max(end , i[1]);
//               }
//               else{
//                   res.add(new int[]{start , end});
//                   start = i[0];
//                   end = i[1];
//               }
//           }
//           res.add(new int[]{start , end});
//           return res.toArray(new int[0][]);
//       }
//   }