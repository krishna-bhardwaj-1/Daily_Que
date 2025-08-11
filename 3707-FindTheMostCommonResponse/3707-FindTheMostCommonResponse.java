// Last updated: 12/08/2025, 00:09:32
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map=new HashMap<>();
        for(List<String> ll:responses){
            Set<String> set=new TreeSet<>(ll);
            for(String s:set){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        Set<String> compareSet=new TreeSet<>();
        int max=Integer.MIN_VALUE;
        for(var entry:map.entrySet()){
            int value=entry.getValue();
            String key=entry.getKey();
            if(value>max){
                compareSet.clear();
                compareSet.add(key);
                max=value;
            }
            else if(value==max){
                compareSet.add(key);
            }
        }
        return compareSet.isEmpty() ? "" : compareSet.iterator().next();
    }
}