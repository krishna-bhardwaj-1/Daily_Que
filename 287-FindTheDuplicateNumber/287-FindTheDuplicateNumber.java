// Last updated: 12/08/2025, 00:18:37
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return i;
            }
            else set.add(i);
        }
        return -1;
    }
}