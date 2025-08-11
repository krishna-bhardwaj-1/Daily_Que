// Last updated: 12/08/2025, 00:11:04
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Set<Integer> setleft=new HashSet<>();
            Set<Integer> setright=new HashSet<>();
            for(int a=0;a<=i;a++){
                setleft.add(nums[a]);
            }
            for(int b=i+1;b<nums.length;b++){
                setright.add(nums[b]);
            }
            arr[i]=setleft.size()-setright.size();
        }
        return arr;
    }
}