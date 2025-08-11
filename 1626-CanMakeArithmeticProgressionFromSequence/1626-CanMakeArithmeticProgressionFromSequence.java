// Last updated: 12/08/2025, 00:14:27
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=Math.abs(arr[1]-arr[0]);
        for(int i=1;i<arr.length-1;i++){
            if(Math.abs(arr[i+1]-arr[i])!=diff) return false;
        }
        return true;
    }
}