// Last updated: 12/08/2025, 00:10:19
class Solution {
    public boolean isValid(String word) {
        int vowel=0;
        int consonent=0;
        if(word.length()<3){
            return false;
        }
        else{
            for(char ch:word.toCharArray()){
                if((ch>=48 && ch<=57) || (ch>=65 && ch<=97) || (ch>=97 && ch<=122)){
                    if((ch>=65 && ch<=97) || (ch>=97 && ch<=122)){
                        if("aeiouAEIOU".indexOf(ch)!=-1){
                             vowel++;
                        }
                        else{
                            consonent++;
                        }
                    }
                }
                else{
                    return false;
                }
            }
        }
        return vowel>=1 && consonent>=1;
    }
}