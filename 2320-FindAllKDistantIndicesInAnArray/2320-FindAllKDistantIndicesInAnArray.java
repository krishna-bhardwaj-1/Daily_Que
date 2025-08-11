// Last updated: 12/08/2025, 00:12:16
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(j-i)<=k && nums[j]==key){
                    ll.add(i);
                    break;
                }
            }
        }
        return ll;
    }
}