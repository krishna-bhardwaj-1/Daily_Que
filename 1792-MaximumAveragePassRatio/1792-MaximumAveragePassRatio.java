// Last updated: 02/09/2025, 01:25:14
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));

        for(int[] ar:classes){
            int pass=ar[0];
            int tot=ar[1];
            double gain=gainA(pass,tot);
            pq.offer(new double[]{gain,pass,tot});
        }

        for(int i=0;i<extraStudents;i++){
            double[] top=pq.poll();
            int pass=(int)top[1]+1;
            int tot=(int)top[2]+1;
            double gain=gainA(pass,tot);
            pq.offer(new double[]{gain,pass,tot});
        }
        double ans=0.0;
        while(!pq.isEmpty()){
            double[] ar=pq.poll();
            ans+=ar[1]/ar[2];
        }
        return ans/classes.length;
    }
    private double gainA(int pass,int tot){
        return (double)(pass+1)/(tot+1)-(double)pass/tot;
    }
}