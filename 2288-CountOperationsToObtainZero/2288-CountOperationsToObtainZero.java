// Last updated: 12/08/2025, 00:12:24
class Solution {
    public int countOperations(int num1, int num2) {
        int c=0;
        while(num1!=0 && num2!=0){
            if(num1<num2){
                c+=num2/num1;
                num2%=num1;
            }
            else{
                c+=num1/num2;
                num1%=num2;
            }
        }
        return c;
    }
}