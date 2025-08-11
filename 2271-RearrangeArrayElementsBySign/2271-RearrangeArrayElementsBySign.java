// Last updated: 12/08/2025, 00:12:29
class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] arr1=new int[nums.length/2];
        // int[] arr2=new int[nums.length/2];
        // int idx1=0,idx2=0;
        // for(int i:nums){
        //     if(i>0) arr1[idx1++]=i;
        //     else arr2[idx2++]=i;
        // }
        // int i=0;
        // int j=0;
        // for(int k=0;k<nums.length;k++){
        //     if(k%2==0) nums[k]=arr1[i++];
        //     else nums[k]=arr2[j++];
        // }
        // return nums;
        int[] arr=new int[nums.length];
        int posidx=0;
        int negidx=1;
        for(int i:nums){
            if(i>0){
                arr[posidx]=i;
                posidx+=2;
            }
            else{
                arr[negidx]=i;
                negidx+=2;
            }
        }
        return arr;
    }
}