// Last updated: 12/08/2025, 00:14:31
class Solution {
    public int kthFactor(int n, int k) {
        int c=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(c==k) return i;
                c++;
            }
        }
        return -1;
    }
}