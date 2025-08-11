// Last updated: 12/08/2025, 00:20:29
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n;i++){
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}