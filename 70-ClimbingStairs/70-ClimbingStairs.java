// Last updated: 12/08/2025, 00:20:46
class Solution {
    public int climbStairs(int n) {
        int[] cache=new int[n+2];
        Arrays.fill(cache,-1);
        return(ways(n+1,cache));
    }
    private int ways(int n,int[] cache){
        if(n==0||n==1){
            return n;
        }
        if(cache[n]!=-1){
            return cache[n];
        }

        //pehli bar dekh rha hu
        int c1=ways(n-1,cache);
        int c2=ways(n-2,cache);
        int meraans=c1+c2;
        cache[n]=meraans;
        return meraans;
    }
}