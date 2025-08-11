// Last updated: 12/08/2025, 00:18:04
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int arr=0;
        for(int i=0;i<nums.length-2;i++){
            if((nums[i+1]-nums[i])==(nums[i+2]-nums[i+1])){
                arr++;
                int diff=nums[i+1]-nums[i];
                for(int j=i+3;j<nums.length;j++){
                    if(nums[j]-nums[j-1]==diff){
                        arr++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return arr;
    }
}