// Last updated: 12/08/2025, 00:09:02
class Solution {
    public String resultingString(String s) {
        StringBuilder st=new StringBuilder();
        for(char ch:s.toCharArray()){
            int size=st.length();
            if(size>0 && iscons(st.charAt(size-1),ch)){
                st.deleteCharAt(size-1);
            }
            else{
                st.append(ch);
            }
        }
        return st.toString();
    }
    private boolean iscons(char a,char b){
        int diff=Math.abs(a-b);
        return diff==1 || diff==25;
    }
}