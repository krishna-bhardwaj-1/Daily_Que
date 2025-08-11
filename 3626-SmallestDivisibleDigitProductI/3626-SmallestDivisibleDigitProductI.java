// Last updated: 12/08/2025, 00:09:44
class Solution {
    public int smallestNumber(int n, int t) {
        while(prod(n)%t!=0){
            n++;
        }
        return n;
    }
    private int prod(int num){
        int pr=1;
        while(num>0){
            pr*=(num%10);
            num/=10;
        }
        return pr;
    }
}