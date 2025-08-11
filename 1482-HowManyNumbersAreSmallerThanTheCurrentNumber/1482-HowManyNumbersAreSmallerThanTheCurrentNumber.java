// Last updated: 12/08/2025, 00:14:55
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=smaller(nums,i);
        }
        return arr;
    }
    private static int smaller(int[] arr,int cr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(i==cr){
                continue;
            }
            if(arr[cr]>arr[i]){
                c++;
            }
        }
        return c;
    }
}