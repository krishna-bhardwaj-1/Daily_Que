// Last updated: 12/08/2025, 00:10:06
class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i+k<=s.length()-1){
                sb.append(s.charAt(i+k));
            }
            else{
                int ap=(i+k)%s.length();
                sb.append(s.charAt(ap));
            }
        }
        return sb.toString();
    }
}