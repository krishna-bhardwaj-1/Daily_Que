// Last updated: 12/08/2025, 00:15:07
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        // int[] array=new int[queries.length];
        // for(int i=0;i<queries.length;i++){
        //     int x=queries[i][0];
        //     int y=queries[i][1];
        //     int ans=0;
        //     for(int j=x;j<=y;j++){
        //         ans^=arr[j];
        //     }
        //     array[i]=ans;
        // }
        // return array;

        int c=arr[0];
        for(int i=1;i<arr.length;i++){
            c^=arr[i];
            arr[i]=c;
        }

        int[] nums=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l>0){
                nums[i]=arr[r]^arr[l-1];
            }   
            else{
                nums[i]=arr[r];
            }
        }
        return nums;
    }
}