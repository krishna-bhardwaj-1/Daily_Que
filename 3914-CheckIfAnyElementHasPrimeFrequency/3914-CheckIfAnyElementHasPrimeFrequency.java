// Last updated: 12/08/2025, 00:08:59
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] arr=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        for(int i:arr){
            if(prime(i)) return true;
        }
        return false;
    }
    private static boolean prime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}