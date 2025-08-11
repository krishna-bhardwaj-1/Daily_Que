// Last updated: 12/08/2025, 00:12:17
class Solution {
    public int countHillValley(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length-1;){
            int back=i;
            int next=i;
            while(back>0 && nums[back]==nums[i]){
                back--;
            }
            while(next<nums.length && nums[next]==nums[i]){
                next++;
            }
            if(back>=0 && next<nums.length){
                if((nums[back]>nums[i] && nums[next]>nums[i]) || (nums[back]<nums[i] && nums[next]<nums[i])){
                    cnt++;
                    i=next;
                    continue;
                }
            }
            i++;
        }
        return cnt;
    }
}