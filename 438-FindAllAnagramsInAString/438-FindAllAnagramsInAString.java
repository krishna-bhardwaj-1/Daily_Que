// Last updated: 12/08/2025, 00:17:59
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            if(anagram(s.substring(i,i+p.length()),p)){
                ll.add(i);
            }
        }
        return ll;
    }
    private static boolean anagram(String s,String t){
        int[] fre=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            fre[ch-'a']--;
        }
        for(int i:fre){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}