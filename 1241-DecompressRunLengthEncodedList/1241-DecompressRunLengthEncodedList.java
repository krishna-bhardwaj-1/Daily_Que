// Last updated: 12/08/2025, 00:15:28
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            for(int cnt=0;cnt<nums[i];cnt++){
                ll.add(nums[i+1]);
            }
        }
        int[] arr=new int[ll.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}