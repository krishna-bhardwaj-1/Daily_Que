// Last updated: 02/09/2025, 23:55:35
class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];

                if(x1<=x2 && y1>=y2){
                    if(havepoint(points,i,j)) ans++;
                }
            }
        }
        return ans;
    }

    private boolean havepoint(int[][] points,int i,int j){
        int x1=points[i][0];
        int y1=points[i][1];
        int x2=points[j][0];
        int y2=points[j][1];

        for(int c=0;c<points.length;c++){
            if(c==i||c==j) continue;
            int x=points[c][0];
            int y=points[c][1];

            if(x<=x2 && x>=x1 && y>=y2 && y<=y1) return false;
        }
        return true;
    }
}