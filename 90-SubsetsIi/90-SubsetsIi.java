// Last updated: 12/08/2025, 00:20:28
class Solution {
    static List<List<Integer>> ll;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ll=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,temp,0);
        return ll;
    }
    private static void subset(int[] arr,List<Integer> ans,int idx){
        if(idx==arr.length){
            if(!ll.contains(ans)) ll.add(new ArrayList<>(ans));
            return;
        }
        subset(arr,ans,idx+1);
        ans.add(arr[idx]);
        subset(arr,ans,idx+1);
        ans.removeLast();
    }
}