// Last updated: 12/08/2025, 00:14:44
class Solution {
    public int maxPower(String s) {
        char c=s.charAt(0);
        int max=1;
        int power=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==c){
                power++;
            }
            else{
                power=1;
                c=s.charAt(i);
            }
            max=Math.max(max,power);
        }
        return max;
    }
}