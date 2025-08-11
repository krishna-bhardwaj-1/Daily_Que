// Last updated: 12/08/2025, 00:09:46
class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int i=10;
        while(n>=0){
            if(n<i){
             return i%2!=0;
            }
            n-=i;
            i--;
        }
        return false;
    }
}