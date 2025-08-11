// Last updated: 12/08/2025, 00:10:53
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i:hours){
            if(i>=target){
                c++;
            }
        }
        return c;
    }
}