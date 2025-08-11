// Last updated: 12/08/2025, 00:11:55
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int max=Integer.MAX_VALUE;
        for(int i=0;i+k<=blocks.length();i++){
            int c=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W') c++;
            }
            max=Math.min(c,max);
        }
        return max;
    }
}