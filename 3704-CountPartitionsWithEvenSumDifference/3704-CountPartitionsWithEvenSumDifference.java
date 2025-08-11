// Last updated: 12/08/2025, 00:09:33
class Solution {
    public int countPartitions(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(sum(nums,i)){
                c++;
            }
        }
        return c;
    }
    private static boolean sum(int[] arr,int idx){
        int sum1=0;
        for(int i=0;i<idx;i++){
            sum1+=arr[i];
        }
        int sum2=0;
        for(int i=idx;i<arr.length;i++){
            sum2+=arr[i];
        }
        return (sum1-sum2)%2==0;
    }
}