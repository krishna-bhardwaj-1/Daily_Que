// Last updated: 12/08/2025, 00:14:03
class Solution {
    public int numberOfMatches(int n) {
        int c=0;
        while(n>=2){
            if(n%2==0){
                c+=n/2;
                n/=2;
            }
            else{
                c+=(n-1)/2;
                n=(n-1)/2+1;
            }
        }
        return c;
    }
}