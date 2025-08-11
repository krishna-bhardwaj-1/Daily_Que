// Last updated: 12/08/2025, 00:09:18
class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>0) set.add(i);
            else max=Math.max(max,i);
        }
        int sum=0;
        for(int i:set){
            sum+=i;
        }
        if(set.size()>0) return sum;
        return max;
    }
}