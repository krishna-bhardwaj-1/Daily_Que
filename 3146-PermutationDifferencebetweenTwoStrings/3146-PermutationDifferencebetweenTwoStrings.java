// Last updated: 30/08/2025, 00:19:37
class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int idx=t.indexOf(s.charAt(i));
            sum+=Math.abs(i-idx);
        }
        return sum;
    }
}