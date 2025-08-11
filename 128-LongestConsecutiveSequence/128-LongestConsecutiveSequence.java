// Last updated: 12/08/2025, 00:19:58
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        // Arrays.sort(nums);
        // int maxlong=1;
        // int lastsmall=nums[0];
        // int cnt=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]-1==lastsmall){
        //         cnt++;
        //         lastsmall=nums[i];
        //     }
        //     else if(nums[i]!=lastsmall){
        //         cnt=1;
        //         lastsmall=nums[i];
        //     }
        //     maxlong=Math.max(maxlong,cnt);
        // }
        // return maxlong;

        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);

        int max=1;
        for(int i:set){
            if(set.contains(i-1)){
                continue;
            }
            else{
                int cnt=1;
                int x=i;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}