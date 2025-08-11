// Last updated: 12/08/2025, 00:13:22
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[2*nums.length];
        int c=0;
        for(int m=0;m<2;m++){
            for(int i=0;i<nums.length;i++){
                arr[c++]=nums[i];
            }
        }
        return arr;
    }
}