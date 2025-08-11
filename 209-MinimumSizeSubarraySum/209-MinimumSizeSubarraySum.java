// Last updated: 12/08/2025, 00:19:10
class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int si=0;
        int ei=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        while(ei<arr.length){
            //grow
            sum+=arr[ei];
            //shrink
            while(sum>=target && si<=ei){
                ans = Math.min(ans, ei - si + 1);
                sum-=arr[si];
                si++;
            }
            ei++;
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}