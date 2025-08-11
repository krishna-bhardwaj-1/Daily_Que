// Last updated: 12/08/2025, 00:13:12
class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        while(max%min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }
        return min;
    }
}