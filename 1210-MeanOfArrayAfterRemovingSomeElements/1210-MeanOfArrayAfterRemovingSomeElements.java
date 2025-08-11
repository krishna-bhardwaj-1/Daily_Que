// Last updated: 12/08/2025, 00:15:36
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int per=(int)Math.floor(n*5.0/100);
        double sum=0;
        for(int i=per;i<arr.length-per;i++){
            sum+=arr[i];
        }
        return sum/(n-2*per);
    }
}