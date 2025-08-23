// Last updated: 23/08/2025, 22:47:05
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            List<Integer> ll=new ArrayList<>();
            if(groupSizes[i]==-1) continue;
            int size=groupSizes[i];
            int j=i;
            while(j<groupSizes.length && ll.size()<size){
                if(groupSizes[j]!=-1 && groupSizes[j]==size){
                    ll.add(j);
                    groupSizes[j]=-1;
                }
                j++;
            }
            ans.add(ll);
        }
        return ans;
    }
}