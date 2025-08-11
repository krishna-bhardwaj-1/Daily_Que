// Last updated: 12/08/2025, 00:16:19
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(String s:words){
            if(equal(s,pattern)) ans.add(s);
        }
        return ans;
    }

    private boolean equal(String s,String p){
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=p.charAt(i);
            if(map1.containsKey(a) && map1.getOrDefault(a,'@')!=b) return false;
            if(map2.containsKey(b) && map2.getOrDefault(b,'@')!=a) return false;
            map1.put(a,b);
            map2.put(b,a);
        }
        return true;
    }
}