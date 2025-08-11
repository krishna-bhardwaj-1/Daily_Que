// Last updated: 12/08/2025, 00:13:47
class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n==0){
            return true;
        }
        int x=n%3;
        if(x==2){
            return false;
        }
        return checkPowersOfThree(n/3);
    }
}