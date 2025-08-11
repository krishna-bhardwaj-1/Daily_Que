// Last updated: 12/08/2025, 00:15:13
class Solution {
    public int subtractProductAndSum(int n) {
        return product(n);
    }
    public int product(int n){
        int c=1;
        int i=0;
        while(n>0){
            int rem=n%10;
            c*=rem;
            i+=rem;
            n/=10;
        }
        return c-i;
    }

}