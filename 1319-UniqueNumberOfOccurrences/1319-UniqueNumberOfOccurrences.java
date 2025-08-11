// Last updated: 12/08/2025, 00:15:20
class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,1)+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int key:map.keySet()){
            if(set.contains(map.get(key))){
                return false;
            }
            set.add(map.get(key));
        }
        return true;
    }
}