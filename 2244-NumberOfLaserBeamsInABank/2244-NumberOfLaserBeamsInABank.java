// Last updated: 12/08/2025, 00:12:36
class Solution {
    public int numberOfBeams(String[] bank) {
        int beam=0;
        int prevcount=0;
        for(String s:bank){
            int currcount=laser(s);
            if(currcount==0){
                continue;
            }
            beam+=prevcount*currcount;
            prevcount=currcount;
        }
        return beam;
    }
    private static int laser(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                c++;
            }
        }
        return c;
    }
}