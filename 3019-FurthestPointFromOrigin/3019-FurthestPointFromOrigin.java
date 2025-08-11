// Last updated: 12/08/2025, 00:10:44
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,und=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') l--;
            else if(moves.charAt(i)=='R') l++;
            else und++;
        }
        return und+Math.abs(l);
    }
}