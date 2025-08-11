// Last updated: 12/08/2025, 00:15:06
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }
            else{
                num--;
            }
            c++;
        }
        return c;
    }
}