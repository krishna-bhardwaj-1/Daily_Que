// Last updated: 12/08/2025, 00:09:14
class Solution {
    public int totalNumbers(int[] nums) {
        // int c=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) continue;
            for(int j=0;j<nums.length;j++){
            if(i==j) continue;
                for(int k=0;k<nums.length;k++){
                    if(k==i || k==j) continue;
                    if(nums[k]%2==0){
                        set.add(nums[i]*100+nums[j]*10+nums[k]);
                    }
                }
            }
        }
        return set.size();
    }
}