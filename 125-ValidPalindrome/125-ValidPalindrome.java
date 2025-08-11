// Last updated: 12/08/2025, 00:19:59
class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
        StringBuilder st=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97&& s.charAt(i)<=122)||(s.charAt(i)>=48&&s.charAt(i)<=57)){
                st.append(s.charAt(i));
            }
        }
        int i=0;
        int j=st.length()-1;
        while(i<=j){
            if(st.charAt(i)==st.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}