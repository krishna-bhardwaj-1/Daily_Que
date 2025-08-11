// Last updated: 12/08/2025, 00:21:12
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>>  map=new HashMap<>();
        for(String currString:strs){
            char[] currStringArray=currString.toCharArray();
            Arrays.sort(currStringArray);
            String sortedString=new String(currStringArray);
            // System.out.println(currString +"->"+sortedString);
            if(map.containsKey(sortedString)){
                List<String> anagramlist=map.get(sortedString);
                anagramlist.add(currString);
                map.put(sortedString,anagramlist);
            }
            else {
                List<String> anagrmlist=new ArrayList<>();
                anagrmlist.add(currString);
                map.put(sortedString,anagrmlist);
            }
        }
        // System.out.println(map);

        List<List<String>> ans=new ArrayList<>();
        ans.addAll(map.values());
        return ans;
    }
}