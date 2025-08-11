// Last updated: 12/08/2025, 00:21:33
class Solution {
    public int removeElement(int[] nums, int val) {
        return Remove(nums,val);
    }
    public static int Remove(int[] arr,int val){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[c]=arr[i];
                c++;
            }
        }
        return c;
    }
}