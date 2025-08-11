// Last updated: 12/08/2025, 00:10:18
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=nums1[0];
        for(int i=1;i<nums1.length;i++){
            min1=Math.min(min1,nums1[i]);
        }
        int min2=nums2[0];
        for(int i=1;i<nums2.length;i++){
            min2=Math.min(min2,nums2[i]);
        }

        return min2-min1;
    }
}