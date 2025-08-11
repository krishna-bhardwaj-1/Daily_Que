// Last updated: 12/08/2025, 00:18:47
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) 
            return false;
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc,tc);
    }
}