// Last updated: 12/08/2025, 00:18:27
class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=count(i);
        }
        return arr;
    }
    private int count(int n){
        int c=0;
        while(n>0){
            int rem=n%2;
            if(rem==1){
                c++;
            }
            n/=2;
        }
        return c;
    }
}