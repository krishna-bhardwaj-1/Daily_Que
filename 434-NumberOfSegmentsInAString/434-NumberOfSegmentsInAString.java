// Last updated: 12/08/2025, 00:18:00
class Solution {
    public int countSegments(String s) {
        if(s.trim().length()==0||s==null){
            return 0;
        }
        s=s.trim();
        String[] arr=s.split("\s+");
        return arr.length;
    }
}