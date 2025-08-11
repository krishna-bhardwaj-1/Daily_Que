// Last updated: 12/08/2025, 00:15:10
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            while(nums[i]>0){
                nums[i]/=10;
                c++;
            }
            if(c%2==0) count++;
            
            // String s=Integer.toString(nums[i]);
            // if(s.length()%2==0) count++;
        }
        return count;
    }
}