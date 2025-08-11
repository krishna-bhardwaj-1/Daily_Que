// Last updated: 12/08/2025, 00:13:37
class Solution {
    public String truncateSentence(String s, int k) {
        String[] st=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(st[i]);
            if(i<k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}