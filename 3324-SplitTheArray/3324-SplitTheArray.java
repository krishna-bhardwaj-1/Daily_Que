// Last updated: 12/08/2025, 00:10:26
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int o=0;
        for(int i:map.values()){
            if(i>2) return false;
            if(i==1) o++;
        }
        if(o%2!=0) return false;
        return true;
    }
}