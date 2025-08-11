// Last updated: 12/08/2025, 00:10:34
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum1+=i;
            }
        }
        return (n*(n+1)/2)-(2*sum1);
    }
}