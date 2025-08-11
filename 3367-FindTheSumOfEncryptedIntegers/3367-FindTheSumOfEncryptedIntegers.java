// Last updated: 12/08/2025, 00:10:25
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i:nums){
            if(i<10){
                sum+=i;
            }
            else{
                int maxDigit=0;
                int digitcnt=0;
                int temp=i;
                while(temp>0){
                    maxDigit=Math.max(maxDigit,temp%10);
                    temp/=10;
                    digitcnt++;
                }

                int encrypt=0;
                for(int c=0;c<digitcnt;c++){
                    encrypt=encrypt*10+maxDigit;
                }
                sum+=encrypt;
            }
        }
        return sum;
    }
}