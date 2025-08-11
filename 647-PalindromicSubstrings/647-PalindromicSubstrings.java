// Last updated: 12/08/2025, 00:17:08
class Solution {
    // public int countSubstrings(String s) {
    //     int c=0;
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i+1;j<=s.length();j++){
    //             String str=s.substring(i,j);
    //             if(ispalindrome(str)){
    //                 c++;
    //             }
    //         }
    //     }
    //     return c;
        
    // }
    // private boolean ispalindrome(String str){
    //     int i=0;
    //     int j=str.length()-1;
    //     while(i<j){
    //         if(str.charAt(i)!=str.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

    public int countSubstrings(String s){
        int odd=0;
        for(int axis=0;axis<s.length();axis++){
            for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
                    break;
                }
                odd++;
            }
        }

        int even=0;
        for(double axis=0.5;axis<s.length();axis++){
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                even++;
            }
        }
        return odd+even;
    }
}