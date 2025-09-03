// Last updated: 03/09/2025, 08:01:11
class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        int ans=0;
        Arrays.sort(points,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[0]==b[0]){
                    return b[1]-a[1];
                }
                return a[0]-b[0];
            }
        });
        for(int i=0;i<n;i++){
            int y1=points[i][1];
            int k=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                int y2=points[j][1];
                if(y2>y1) continue;
                if(y2>k){
                    ans++;
                    k=y2;
                }
            }
        }
        return ans;
    }
}