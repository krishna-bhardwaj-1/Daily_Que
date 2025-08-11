// Last updated: 12/08/2025, 00:13:35
class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i<0){
                c++;
            }
            if(i==0){
                return 0;
            }
        }
        if(c%2==0){
            return 1;
        }
        return -1;
    }
}