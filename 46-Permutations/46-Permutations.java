// Last updated: 12/08/2025, 00:21:18
class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        helper(new ArrayList<>(),nums);
        return ans;
    }

    private void helper(List<Integer> ll,int[] nums){
        if(nums.length==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int[] newarr=new int[nums.length-1];
            int idx=0;
            for(int j=0;j<nums.length;j++){
                if(j!=i) newarr[idx++]=nums[j];
            }
            ll.add(n);
            helper(ll,newarr);
            ll.remove(ll.size()-1);
        }
    }
}