// Last updated: 12/08/2025, 00:15:37
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n];
        for(int[] curr:bookings){
            int c=curr[0];
            for(int a=c-1;a<curr[1];a++){
                arr[a]+=curr[2];
            }
        }
        return arr;
    }
}