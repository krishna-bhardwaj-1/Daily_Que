// Last updated: 12/08/2025, 00:11:21
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums2){
            set.add(i);
        }
        for(int i:nums1){
            if(set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}