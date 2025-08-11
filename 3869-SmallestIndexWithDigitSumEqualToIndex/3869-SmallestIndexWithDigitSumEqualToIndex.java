// Last updated: 12/08/2025, 00:09:01
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==sum(nums[i])) return i;
        }
        return -1;
    }
    public int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}