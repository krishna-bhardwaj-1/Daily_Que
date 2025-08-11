// Last updated: 12/08/2025, 00:12:05
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int c=0;
        int[] arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&nums[i]!=-1&&nums[j]!=-1){
                    nums[i]=-1;
                    nums[j]=-1;
                    c++;
                }
            }
        }
        arr[0]=c;
        arr[1]=nums.length-2*c;
        return arr;
    }
}