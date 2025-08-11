// Last updated: 12/08/2025, 00:09:43
class Solution {
    public int lengthAfterTransformations(String s, int t) {
        long[] arr=new long[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        long mod = 1_000_000_007;
        while(t-->0){
            long[] temp=new long[26];
            for(int i=0;i<26;i++){
                if(arr[i]>0){
                    if(i==25){
                        temp[0]+=arr[i]%mod;
                        temp[1]+=arr[i]%mod;
                    }
                    else{
                        temp[i+1]+=arr[i];
                    }
                }
            }

            for(int i=0;i<26;i++){
                arr[i]=temp[i];
            }
        }

        long sum=0;
        for(long i:arr){
            sum+=i;
        }
        return (int)(sum%1000_000_007);
    }
}