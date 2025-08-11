// Last updated: 12/08/2025, 00:17:07
class Solution {
    static boolean haspossible;
    public boolean judgeCircle(String moves) {
        haspossible=false;
        ispossible(moves,0,0);
        return haspossible;
    }
    public void ispossible(String move,int cr,int cc){
        for(char c:move.toCharArray()){
            if(c=='U'){
                cr++;
            }
            else if(c=='D'){
                cr--;
            }
            else if(c=='L'){
                cc++;
            }
            else{
                cc--;
            }
        }
        if(cr==0 && cc==0){
            haspossible=true;
        }
    }
}