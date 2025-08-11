// Last updated: 12/08/2025, 00:12:19
class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            if(i%2!=0) return false;
        }
        return true;
    }

}