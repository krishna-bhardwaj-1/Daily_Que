// Last updated: 12/08/2025, 00:13:18
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(String ss:words){
            sb.append(ss);
            if(s.equals(sb.toString())){
                return true;
            }
        }
        return false;
    }
}