// Last updated: 12/08/2025, 00:12:46
class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=0;
        int max=0;
        for(String s:sentences){
            String[] arr=s.split(" +");
            len=arr.length;
            if(len>max){
                max=len;
            }
        }
        return max;
    }
}