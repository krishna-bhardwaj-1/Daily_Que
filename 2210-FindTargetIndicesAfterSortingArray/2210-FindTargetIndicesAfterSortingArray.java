// Last updated: 12/08/2025, 00:12:50
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==target)
           {
               ll.add(i);
           }
        }
        return ll;
    }
}