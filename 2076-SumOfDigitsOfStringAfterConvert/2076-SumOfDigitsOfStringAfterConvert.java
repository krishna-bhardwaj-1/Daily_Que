// Last updated: 12/08/2025, 00:13:21
class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        //tranform 1 time
        for(char ch:s.toCharArray()){
            int num=ch-'a'+1;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
        }
        // loop chalao 1 se k tak
        for(int i=1;i<k;i++){
            int newsum=0;
            while(sum>0){
                newsum+=sum%10;
                sum/=10;
            }
            sum=newsum;
        }
        return sum;
    }
}