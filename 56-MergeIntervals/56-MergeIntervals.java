// Last updated: 12/08/2025, 00:21:02
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1,int[] o2){
                return o1[0]-o2[0];
            }
        });
        List<int[]> ans=new ArrayList<>();
        int st=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(new int[] {st,end});
                st=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(new int[] {st,end});
        int[][] arr=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}