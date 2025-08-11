// Last updated: 12/08/2025, 00:18:44
class Solution {
    public int addDigits(int n) {
        int sum=0;
        if(n>=10){
            while(n>=10){
                int rem=n%10;
                n/=10;
                sum=n+rem;
                n=sum;
            }
        }
        else{
            sum=n;
        }
        return sum;
    }
}