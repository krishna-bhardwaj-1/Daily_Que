// Last updated: 12/08/2025, 00:21:24
class Solution {
    public String countAndSay(int n) {
        String ans="1";
        if(n==1) return ans;
        while(n>1){
            ans=cndsay(ans);
            n--;
        }
        return ans;
    }

    private static String cndsay(String s){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            int c=0,j=i;
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                c++;
                j++;
            }
            sb.append(c);
            sb.append(s.charAt(i));
            i=j;
        }
        return sb.toString();
    }
}