// Last updated: 28/08/2025, 00:27:38
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String key=key(strs[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }

    private String key(String s){
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:fre){
            sb.append(i+" ");
        }
        return sb.toString();
    }
}