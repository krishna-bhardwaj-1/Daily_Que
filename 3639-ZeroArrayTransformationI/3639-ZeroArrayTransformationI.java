// Last updated: 12/08/2025, 00:09:40
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] arr=new int[nums.length+1];

        for(int[] ar:queries){
            int l=ar[0];
            int r=ar[1];
            arr[l]++;
            arr[r+1]--;
        }

        int cf=0;
        for(int i=0;i<nums.length;i++){
            cf+=arr[i];
            if(cf<nums[i]) return false;
        }
        return true;
    }
}