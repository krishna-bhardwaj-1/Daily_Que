// Last updated: 12/08/2025, 00:11:44
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
}