// Last updated: 12/08/2025, 00:13:36
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int i=0;i<logs.length;i++){
                Set<Integer> time=map.getOrDefault(logs[i][0],new HashSet<>());
                time.add(logs[i][1]);
                map.put(logs[i][0],time);
        }
        Map<Integer,Integer> uam=new HashMap<>();
        for(var entry:map.entrySet()){
            uam.put(entry.getKey(),entry.getValue().size());
        }
        int[] ans=new int[k];
        for(int i:uam.values()){
            ans[i-1]++;
        }
        return ans;
    }
}