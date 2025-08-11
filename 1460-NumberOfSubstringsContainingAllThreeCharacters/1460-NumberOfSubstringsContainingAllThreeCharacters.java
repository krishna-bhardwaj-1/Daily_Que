// Last updated: 12/08/2025, 00:15:01
class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int[] last={-1,-1,-1};// a b c
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
            if(last[0]!=-1 && last[1]!=-1 && last[2]!=-1){
                ans+=Math.min(last[0],Math.min(last[1],last[2]))+1;
            }
        }
        return ans;
    }
}