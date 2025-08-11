// Last updated: 12/08/2025, 00:15:59
class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>1) return i;
        }
        return 0;
    }
}