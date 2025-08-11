// Last updated: 12/08/2025, 00:09:50
class Solution {
    public char kthCharacter(int k) {
        String ans="a";
        while(ans.length()<=k){
            StringBuilder sb=new StringBuilder();
            for(char ch:ans.toCharArray()){
                if(ch=='z') sb.append('a');
                else sb.append((char)(ch+1));
            }
            ans=ans+sb.toString();
        }
        return ans.charAt(k-1);
    }
}