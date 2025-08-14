// Last updated: 15/08/2025, 01:04:47
class Solution {
    public String largestGoodInteger(String num) {
        String s="";
        int max=-1;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                max=Math.max(max,num.charAt(i)-'0');
            }
        }
        if(max!=-1){
            s=String.valueOf(max).repeat(3);
        }
        return s;
    }
}