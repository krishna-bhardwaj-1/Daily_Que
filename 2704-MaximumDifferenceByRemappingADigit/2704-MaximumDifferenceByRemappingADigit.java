// Last updated: 12/08/2025, 00:11:17
class Solution {
    public int minMaxDifference(int num) {
        String s1=Integer.toString(num);
        String s2=s1;
        int idx=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!='9'){
                idx=i;
                break;
            }
        }
        s1=s1.replace(s1.charAt(idx),'9');
        s2=s2.replace(s2.charAt(0),'0');
        return Integer.parseInt(s1)-Integer.parseInt(s2);
    }
}