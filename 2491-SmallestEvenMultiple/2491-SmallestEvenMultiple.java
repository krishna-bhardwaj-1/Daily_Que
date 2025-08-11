// Last updated: 12/08/2025, 00:11:47
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else{
            return 2*n;
        }
    }
}