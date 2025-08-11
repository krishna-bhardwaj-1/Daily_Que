// Last updated: 12/08/2025, 00:09:12
class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int val=(123-s.charAt(i))*(i+1);
            ans+=val;
        }
        return ans;
    }
}