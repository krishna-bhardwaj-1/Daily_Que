// Last updated: 12/08/2025, 00:21:01
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int idx=search(intervals,newInterval[0]);
        List<int[]> temp=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(i==idx) temp.add(newInterval);
            temp.add(intervals[i]);
        }
        if(idx==intervals.length) temp.add(newInterval);

        int st=temp.get(0)[0];
        int end=temp.get(0)[1];
        List<int[]> ans=new ArrayList<>();
        for(int i=1;i<=intervals.length;i++){
            if(temp.get(i)[0]<=end){
                end=Math.max(end,temp.get(i)[1]);
            }
            else{
                ans.add(new int[] {st,end});
                st=temp.get(i)[0];
                end=temp.get(i)[1];
            }
        }
        ans.add(new int[] {st,end});

        int[][] arr=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }

    public int search(int[][] intervals,int val){
        int lo=0,hi=intervals.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(intervals[mid][0]>=val) hi=mid-1;
            else lo=mid+1;
        }
        return lo;
    } 
}