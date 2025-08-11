// Last updated: 12/08/2025, 00:16:14
class Solution {
    public int[] sortArray(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    private static int[] helper(int[] nums,int si,int ei){
        if(si==ei){
            int[] bs=new int[1];
            bs[0]=nums[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int[] a=helper(nums,si,mid);
        int[] b=helper(nums,mid+1,ei);
        return merge(a,b);
    }
    private static int[] merge(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        int[] ans=new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<m){
            if(a[i]<b[j]){
                ans[k]=a[i];
                k++;
                i++;
            }
            else {
                ans[k]=b[j];
                k++;
                j++;
            }
        }
        while (i<n){
            ans[k]=a[i];
            k++;
            i++;
        }

        while (j<m){
            ans[k]=b[j];
            k++;
            j++;
        }
        return ans;
    }
}