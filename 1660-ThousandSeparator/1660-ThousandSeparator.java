// Last updated: 12/08/2025, 00:14:18
class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        int p=sb.length()-3;
        while(p>0){
            sb.insert(p,".");
            p-=3;
        }
        return sb.toString();
    }
}