// Last updated: 12/08/2025, 00:13:19
class Solution {
    public boolean isThree(int n) {
        int c=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) c++;
            if(c>3) return false;
        }
        if(c==3) return true;
        return false;
    }
}