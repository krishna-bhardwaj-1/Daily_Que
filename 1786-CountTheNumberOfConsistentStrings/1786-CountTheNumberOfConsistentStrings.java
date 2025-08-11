// Last updated: 12/08/2025, 00:14:07
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String s:words){
            if(allow(s,allowed)) c++;
        }
        return c;
    }
    private static boolean allow(String s,String ans){
        for(char ch:s.toCharArray()){
            if(ans.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}