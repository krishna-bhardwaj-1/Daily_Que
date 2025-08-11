// Last updated: 12/08/2025, 00:21:58
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int si=0;
        int ei=0;
        int ans=0;
        int[] arr=new int[128];
        while(ei<s.length()){
            //growing
            char ch=s.charAt(ei);
            arr[ch]++;
            //shrink
            while(arr[ch]>1&&si<=ei){
                arr[s.charAt(si)]--;
                si++;
            }
            //update
            ans=Math.max(ans,(ei-si+1));
            ei++;
        }
        return ans;
    }
}