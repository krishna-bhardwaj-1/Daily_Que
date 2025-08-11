// Last updated: 12/08/2025, 00:11:11
class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String s:details){
            String str=s.substring(11,13);
            if(Integer.parseInt(str)>60){
                c++;
            }
        }
        return c;
    }
}