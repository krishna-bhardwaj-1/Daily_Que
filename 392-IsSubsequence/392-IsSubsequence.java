// Last updated: 12/08/2025, 00:18:08
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                // j++;
            }
            j++;
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}