// Last updated: 12/08/2025, 00:16:31
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int l=shifts.length;
        shifts[l-1]%=26;
        for(int i=l-2;i>=0;i--){
            shifts[i]+=shifts[i+1];
            shifts[i]%=26;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ch = (s.charAt(i) - 'a' + shifts[i]) % 26;
            sb.append((char) (ch + 'a'));
        }
        return sb.toString();
    }
}