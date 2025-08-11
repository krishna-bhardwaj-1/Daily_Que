// Last updated: 12/08/2025, 00:09:36
class Solution {
    public boolean hasMatch(String s, String p) {
        int idx=p.indexOf('*');
        int first=s.indexOf(p.substring(0,idx));
        int last=s.indexOf(p.substring(idx+1),first+idx);
        if(first!=-1 && last!=-1){
            return true;
        }
        return false;
    }
}