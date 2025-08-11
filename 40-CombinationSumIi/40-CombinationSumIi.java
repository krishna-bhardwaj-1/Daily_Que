// Last updated: 12/08/2025, 00:21:21
class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,ll,0);
        return ans;
    }

    private void helper(int[] candidates,int target,List<Integer> ll,int idx){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            ll.add(candidates[i]);
            helper(candidates,target-candidates[i],ll,i+1);
            ll.remove(ll.size()-1);
        }
    }
}