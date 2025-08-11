// Last updated: 12/08/2025, 00:19:14
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return PrimeSieve(n);
    }
    public static int PrimeSieve(int n){
        boolean[] ans=new boolean[n];
        ans[0]=ans[1]=true;
        for (int i=2;i*i<ans.length;i++){
            if(ans[i]==false){
                for (int j=2;i*j<ans.length;j++){
                    ans[i*j]=true;
                }
            }
        }
        int c=0;
        for(int i=2;i<ans.length;i++){
            if(ans[i]==false){
                c++;
            }
        }
        return c;
    }
}