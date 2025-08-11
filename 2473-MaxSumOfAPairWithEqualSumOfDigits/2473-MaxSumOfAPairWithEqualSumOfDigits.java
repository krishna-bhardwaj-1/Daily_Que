// Last updated: 12/08/2025, 00:11:51
class Solution {
    public int maximumSum(int[] nums) {
        int[] arr=new int[82];
        Arrays.fill(arr,-1);
        int ans=-1;
        for(int temp:nums){
            int sum=0;
            int num=temp;
            while(num>0){
                sum+=(num%10);
                num/=10;
            }
            if(arr[sum]!=-1){
                ans=Math.max(ans,temp+arr[sum]);
            }
            arr[sum]=Math.max(arr[sum],temp);
        }
        return ans;
    }
}