// Last updated: 12/08/2025, 00:20:39
class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        helper(ll,n,k,1);
        return ans;
    }

    private void helper(List<Integer> ll,int n,int k,int i){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(;i<=n;i++){
            ll.add(i);
            helper(ll,n,k,i+1);
            ll.remove(ll.size()-1);
        }
    }
}