// Last updated: 12/08/2025, 00:11:50
class Solution {
    static int c;
    public int longestNiceSubarray(int[] nums) {
        c=0;
        subset(0,0,nums,new ArrayList<>());
        return c;
    }
    private static void subset(int si,int ei, int[] arr, List<Integer> ans){
        while (ei<arr.length){
            //grow
            ans.add(arr[ei]);
            //shrink
            while (!nice(ans)){
                ans.remove(0);
                si++;
            }
            c=Math.max(c,ans.size());
            ei++;
        }
    }
    private static boolean nice(List<Integer> arr){
        if(arr.size()==1) return true;
        for(int i=0;i<arr.size()-1;i++){
            for (int j=i+1;j<arr.size();j++){
                if((arr.get(i) & arr.get(j))!=0) return false;
            }
        }
        return true;
    }
}