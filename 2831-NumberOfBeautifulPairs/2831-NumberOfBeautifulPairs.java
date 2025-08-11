// Last updated: 12/08/2025, 00:10:57
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            int p=nums[i];
            while(p>=10){
                p/=10;
            }
            for(int j=i+1;j<nums.length;j++){
                int n=nums[j]%10;
                if(coprime(p,n)==1){
                    c++;
                }
            }
        }
        return c;
    }
    private static int coprime(int x,int y){
        while(y%x!=0){
            int rem=y%x;
            y=x;
            x=rem;
        }
        return x;
    }
}