// Last updated: 12/08/2025, 00:10:23
class Solution {
    static int sum;
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        sum=0;
        sumdigit(x);
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
    private static void sumdigit(int n){
        while(n>0){
            sum+=n%10;
            n/=10;
        }
    }
}