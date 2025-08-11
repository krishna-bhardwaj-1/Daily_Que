// Last updated: 12/08/2025, 00:20:06
class Solution {
    public List<List<Integer>> generate(int numRows) {
        int row=0;
        List<List<Integer>> ans=new ArrayList<>();
        while(row<numRows){
            List<Integer> ll=new ArrayList<>();
            int i=0;
            int ncr=1;
            while(i<=row){
                ll.add(ncr);
                ncr=((row-i)*ncr)/(i+1);
                i++;
            }
            ans.add(ll);
            row++;
        }
        return ans;
    }
}