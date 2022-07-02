// T.C : O(N) 
// S.C : O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        List<Integer> curRow , prevRow = null;
        
        for(int i = 0 ; i < numRows ; i++){
            curRow = new ArrayList<>();
            
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    curRow.add(1);
                }
                else{
                    curRow.add(prevRow.get(j - 1) + prevRow.get(j));   
                }
            }
            prevRow = curRow;
            res.add(curRow);
        }
        
        return res;
    }
}