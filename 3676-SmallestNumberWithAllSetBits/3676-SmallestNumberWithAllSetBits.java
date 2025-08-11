// Last updated: 12/08/2025, 00:09:37
class Solution {
    public int smallestNumber(int n) {
        int c=0;
        while(n>0){
            c++;
            n/=2;
        }
        int p=(int)Math.pow(2,c);
        return p-1;
    }
}