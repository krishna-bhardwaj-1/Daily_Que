// Last updated: 12/08/2025, 00:13:03
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val=0;
        for(String s:operations){
            if(s.equals("++X") || s.equals("X++")){
                val+=1;
            }
            else val-=1;
        }
        return val;
    }
}