// Last updated: 12/08/2025, 00:12:39
class Solution {
    public boolean isSameAfterReversals(int num) {
        int a=reverse(num);
        int b=reverse(a);
        return num==b;
    }
    private int reverse(int num){
        int cnum=num;
        int len=0;
        while(cnum>0){
            len++;
            cnum/=10;
        }
        cnum=num;
        int revnum=0;
        while(cnum>0){
            int rem=cnum%10;
            revnum+=rem*Math.pow(10,len-1);
            len--;
            cnum/=10;
        }
        return revnum;
    }
}