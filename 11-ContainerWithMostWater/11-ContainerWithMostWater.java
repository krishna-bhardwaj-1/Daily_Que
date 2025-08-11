// Last updated: 12/08/2025, 00:21:52
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxwater=0;
        while(i<j){
            int y=j-i;
            int x=Math.min(height[i],height[j]);
            int water=x*y;
            maxwater=Math.max(maxwater,water);
            if(height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return maxwater;
    }
}