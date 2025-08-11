// Last updated: 12/08/2025, 00:12:53
class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
        int max=0;
        for(int i=0;i<colors.length;i++){
            for(int j=1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    ans=Math.abs(i-j);
                }
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}