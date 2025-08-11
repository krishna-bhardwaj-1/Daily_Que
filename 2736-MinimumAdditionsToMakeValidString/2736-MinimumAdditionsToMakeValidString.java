// Last updated: 12/08/2025, 00:11:10
class Solution {
    public int addMinimum(String word) {
        int i=0,ans=0;
        for(;i<word.length();){
            int cnt=0;
            if(word.charAt(i)=='a'){
                cnt++;
                i++;
            }
            if((i<word.length())&&word.charAt(i)=='b'){
                cnt++;
                i++;
            }
            if((i<word.length())&&word.charAt(i)=='c'){
                i++;
                cnt++;
            }
            ans+=3-cnt;
        }
        return ans;
    }
}