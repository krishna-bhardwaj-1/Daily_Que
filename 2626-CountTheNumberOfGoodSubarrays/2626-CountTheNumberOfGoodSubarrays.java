// Last updated: 12/08/2025, 00:11:24
class Solution {
    public long countGood(int[] nums, int k) {
        long gusubsarray=0;
        int i=0,j=0;
        int pair=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(i<nums.length){
            while(j<nums.length && pair<k){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.get(nums[j])>=2){
                    pair+=map.get(nums[j])-1;
                }
                j++;
            }
            if(pair>=k){
                gusubsarray+=nums.length-j+1;
            }

            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])>0){
                pair-=map.get(nums[i]);
            }
            i++;
        }
        return gusubsarray;
    }
}