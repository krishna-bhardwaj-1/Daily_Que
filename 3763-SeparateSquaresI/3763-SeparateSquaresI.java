// Last updated: 12/08/2025, 00:09:21
class Solution {
    public double separateSquares(int[][] squares) {
        int n=squares.length;
        double area=0.0;
        double low=Double.MAX_VALUE;
        double hi=-Double.MAX_VALUE;

        for(int[] arr:squares){
            int y=arr[1], l=arr[2];
            area+=(double) l*l;
            low=Math.min(low,y);
            hi=Math.max(hi,y+l);
        }

        double target=area/2.0;

        for(int i=0;i<100;i++){
            double mid=(low+hi)/2.0;
            double areadown=0.0;
            for(int[] s:squares){
                double y=s[1];
                double l=s[2];
                double top=y+l;
                if(mid<=y){
                    areadown+=0;
                }
                else if(mid>=top){
                    areadown+=l*l;
                }
                else{
                    areadown+=(mid-y)*l;
                }
            }
            if(areadown<target){
                low=mid;
            }
            else{
                hi=mid;
            }
        }
        return hi;
    }
}