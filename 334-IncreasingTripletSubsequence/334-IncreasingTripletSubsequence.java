// Last updated: 12/08/2025, 00:18:29
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i:nums){
            if(a>=i){
                a=i;
            }
            else if(b>=i){
                b=i;
            }
            else {
                return true;
            }
        }
        return false;
    }
}