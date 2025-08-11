// Last updated: 12/08/2025, 00:09:26
class Solution {
    public int subarraySum(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int x=Math.max(0,i-nums[i]);
            int sum=0;
            for(int c=x;c<=i;c++){
                sum+=nums[c];
            }
            arr[i]=sum;
        }
        int totsum=0;
        for(int i:arr){
            totsum+=i;
        }
        return totsum;
    }
}