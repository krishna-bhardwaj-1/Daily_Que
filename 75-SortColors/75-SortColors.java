// Last updated: 12/08/2025, 00:20:40
class Solution {
    public void sortColors(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int i=0;
        while(i<=right){
            if(arr[i]==0){
                int temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
                i++;
            }
            else if(arr[i]==1){
                i++;
            }
            else{
                int temp=arr[right];
                arr[right]=arr[i];
                arr[i]=temp;
                right--;
            }
        }
    }
}