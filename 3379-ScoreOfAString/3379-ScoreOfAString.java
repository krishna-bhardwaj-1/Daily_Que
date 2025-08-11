// Last updated: 12/08/2025, 00:10:21
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int fir=(int)s.charAt(i);
            int sec=(int) s.charAt(i+1);
            sum+=Math.abs(fir-sec);
        }
        return sum;
    }
}