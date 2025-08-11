// Last updated: 12/08/2025, 00:09:25
class Solution {
    public String findValidPair(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i)!=s.charAt(i+1) )&& iscount(s,s.charAt(i),s.charAt(i+1))){
                ans.append(s.charAt(i));
                ans.append(s.charAt(i+1));
                break;
            }
        }
        return ans.toString();
    }
    private static boolean iscount(String s,char a,char b){
        int acount=0;
        int bcount=0;
        for(char ch:s.toCharArray()){
            if(ch==a){
                acount++;
            }
            if(ch==b){
                bcount++;
            }
        }
        int num1=a-'0';
        int num2=b-'0';
        return (num1==acount && num2==bcount);
    }
}