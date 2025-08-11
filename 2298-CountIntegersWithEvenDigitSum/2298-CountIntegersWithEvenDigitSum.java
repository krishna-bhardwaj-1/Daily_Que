// Last updated: 12/08/2025, 00:12:22
class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            if(even(i)) c++;
        }
        return c;
    }
    private static boolean even(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum%2==0;
    }
}