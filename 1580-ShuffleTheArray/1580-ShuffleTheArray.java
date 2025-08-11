// Last updated: 12/08/2025, 00:14:35
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int c=0;
        int i=0;
        int j=n;
        while(j<nums.length){
            arr[c]=nums[i];
            c++;
            arr[c]=nums[j];
            c++;
            i++;
            j++;
        }
        return arr;
    }
}