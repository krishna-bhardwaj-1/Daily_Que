// Last updated: 12/08/2025, 00:10:02
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int x:nums){
            if(x%3!=0){
                c+=Math.min(x%3,3-(x%3));
            }
        }
        return c;
    }
}