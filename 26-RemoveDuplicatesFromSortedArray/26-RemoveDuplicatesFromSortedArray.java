// Last updated: 12/08/2025, 00:21:35
class Solution {
    public int removeDuplicates(int[] nums) {
        return (unique_elements(nums));
    }
    public static int unique_elements(int[] arr){
        if(arr.length==0) return 0;
        if(arr.length==1) return 1;
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}