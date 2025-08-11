// Last updated: 12/08/2025, 00:09:48
class Solution {
    public int possibleStringCount(String word) {
        int cnt=1;
        int i=0;
        while(i<word.length()){
            int j=i;
            while(j<word.length() && word.charAt(i)==word.charAt(j)) j++;
            cnt+=j-i-1;
            i=j;
        }
        return cnt;
    }
}