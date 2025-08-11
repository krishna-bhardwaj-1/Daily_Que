// Last updated: 12/08/2025, 00:17:19
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int preSum=0;
        int cnt=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int rem=preSum-k;
            cnt+=map.getOrDefault(rem,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}