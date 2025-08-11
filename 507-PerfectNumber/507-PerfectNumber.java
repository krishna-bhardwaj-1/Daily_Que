// Last updated: 12/08/2025, 00:17:36
class Solution {
    public boolean checkPerfectNumber(int num) {
        int factsum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                factsum+=i;
            }
        }
        return (num==factsum);
    }
}