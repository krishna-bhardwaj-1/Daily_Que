// Last updated: 12/08/2025, 00:17:44
class Solution {
    public int[] constructRectangle(int area) {
        int L=area;
        int W=0;
        for(int i=(int)Math.sqrt(area);i>=1;i--){
            if(area%i==0){
                W=i;
                L=area/i;
                break;
            }
        }
        return new int[]{L, W};
    }
}