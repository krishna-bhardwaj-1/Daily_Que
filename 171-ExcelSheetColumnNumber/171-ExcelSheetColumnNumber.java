// Last updated: 12/08/2025, 00:19:28
class Solution {
    public int titleToNumber(String columnTitle) {
        char[] s=columnTitle.toCharArray();
        int sum=0;
        for(int i=0;i<s.length;i++){
            int num=s[i]-64;
            sum=sum*26+num;
        }
        return sum;
    }
}