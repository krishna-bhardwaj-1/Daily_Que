// Last updated: 12/08/2025, 00:09:29
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        for(int i=0;i<=s.length()-k;i++){
            char ch=s.charAt(i);
            int j=i;
            boolean isvalid=true;
            for(;j<i+k;j++){
                if(s.charAt(j)!=ch){
                    isvalid=false;
                    break;
                }
            }
            if(isvalid){
                if((i==0 || s.charAt(i-1)!=ch)&&(i+k==s.length() || s.charAt(i+k)!=ch)){
                    return true;
                }
            }
        }
        return false;
    }
}