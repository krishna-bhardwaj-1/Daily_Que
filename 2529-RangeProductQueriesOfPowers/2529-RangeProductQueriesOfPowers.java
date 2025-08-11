// Last updated: 12/08/2025, 00:11:40
class Solution {
    private long mod=1_000_000_007L;
    public int[] productQueries(int n, int[][] queries) {
        //powers array

        List<Long> power=new ArrayList<>();
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                power.add(1L<<i);
            }
        }

        //prefix
        long[] prefix=new long[power.size()];
        prefix[0]=power.get(0)%mod; 
        for(int i=1;i<prefix.length;i++){
            prefix[i]=(prefix[i-1]*power.get(i)%mod)%mod;
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==0){
                ans[i]=(int) prefix[r];
            }
            else{
                // a-> b = b/c;
                long b=prefix[r];
                long c=prefix[l-1];
                long inv=modinv(c,mod-2);
                ans[i]=(int)((b*inv)%mod);
            }
        }
        return ans;
    }

    private long modinv(long base,long expo){
        long res=1L;
        while(expo>0){
            if((expo&1)==1){
                res=(res*base)%mod;;
            }
            base=(base*base)%mod;;
            expo=expo>>1;
        }
        return res;
    }
}