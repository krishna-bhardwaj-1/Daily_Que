// Last updated: 12/08/2025, 00:21:32
class Solution {
    public int strStr(String haystack, String needle) {
        // if(haystack.length()<needle.length())
        //     return -1;
        // for(int i=0;i<haystack.length()-needle.length();i++){
        //     int j=0;
        //     while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
        //         j++;
        //     if(j==needle.length()){
        //         return i;
        //     }
        // }
        // return -1;
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}