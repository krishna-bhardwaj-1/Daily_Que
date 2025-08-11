// Last updated: 12/08/2025, 00:21:29
class Solution {
    public int search(int[] nums, int target) {
        return search_rsarray(nums,target);
    }
    public static int search_rsarray(int[] arr,int tar){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==tar) return mid;
            //left part of the array is sorted
            if(arr[lo]<=arr[mid]){
                if(arr[lo]<=tar && arr[mid]>=tar) hi=mid-1;
                else lo=mid+1;
            }
            //right part of the array is sorted
            else {
                if(arr[mid]<=tar && arr[hi]>=tar) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
}