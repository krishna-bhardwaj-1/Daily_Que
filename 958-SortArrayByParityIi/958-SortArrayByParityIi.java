// Last updated: 12/08/2025, 00:16:11
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%2==0 && nums[i]%2!=0){
                int x=finder1(nums,i);
                if(x!=-1){
                   int temp=nums[i];
                   nums[i]=nums[x];
                   nums[x]=temp;
                }
                else continue;
            }
            else if(i%2!=0 && nums[i]%2==0){
                int x=finder2(nums,i);
                if(x!=-1){
                    int temp=nums[i];
                    nums[i]=nums[x];
                    nums[x]=temp;
                }
                else continue;
            }
        }
        return nums;
    }
    private int finder1(int[] nums,int i){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]%2==0) return j;
        }
        return -1;
    }

    private int finder2(int[] nums,int i){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]%2!=0) return j;
        }
        return -1;
    }
}