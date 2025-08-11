// Last updated: 12/08/2025, 00:13:59
class Solution {
    public boolean halvesAreAlike(String s) {
        String st=s.toLowerCase();
        int mid=st.length()/2;
        String pre=st.substring(0,mid);
        String fin=st.substring(mid);
        if(vowel(pre)==vowel(fin)){
            return true;
        }
        return false;
    }
    private int vowel(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
        }
        return c;
    }
}