// Last updated: 12/08/2025, 00:19:30
class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans=new StringBuilder();
        while (n > 0) {
            n--;
            ans.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        return ans.reverse().toString();
    }
}