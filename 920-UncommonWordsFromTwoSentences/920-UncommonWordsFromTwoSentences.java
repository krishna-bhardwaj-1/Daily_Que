// Last updated: 12/08/2025, 00:16:21
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ll=new ArrayList<>();
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String s:str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:str2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(var entry:map.entrySet()){
            if(entry.getValue()==1){
                ll.add(entry.getKey());
            }
        }

        return ll.toArray(new String[0]);
    }
}