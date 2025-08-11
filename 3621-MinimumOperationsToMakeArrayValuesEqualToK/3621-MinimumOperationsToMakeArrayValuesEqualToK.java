// Last updated: 12/08/2025, 00:09:47
class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            if(i<k) return -1;
        }

        int c=0;
        for(int i:set){
            if(i>k) c++;
        }
        return c;
    }
}