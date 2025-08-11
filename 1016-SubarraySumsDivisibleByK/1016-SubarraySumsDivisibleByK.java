// Last updated: 12/08/2025, 00:15:55
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq=new int[k];
        int sum=0;
        freq[0]=1;
        for(int i:nums){
            sum+=i;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            freq[rem]++;
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                int x=freq[i];
                ans+=(x*(x-1))/2;
            }
        }
        return ans;
    }
}