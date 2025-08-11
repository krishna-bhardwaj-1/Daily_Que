// Last updated: 12/08/2025, 00:21:50
class Solution {
    public String longestCommonPrefix(String[] strs) {
        return(strs[0].substring(0,name(strs)));
    }
    public static int name(String[] s){
        int n=Integer.MAX_VALUE;
        for(int i=0;i<s.length;i++){
            n=Math.min(n,s[i].length());
        }
        int i=0;
		for(i=0;i<n;i++) {
			char c=s[0].charAt(i);
			for(int j=1;j<s.length;j++) {
				if(s[j].charAt(i)!=c) {
					return i;
				}
			}
		}
		return n;
    }
}