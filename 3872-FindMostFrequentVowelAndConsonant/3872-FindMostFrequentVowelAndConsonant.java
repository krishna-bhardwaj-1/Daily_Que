// Last updated: 12/08/2025, 00:08:58
class Solution {
    public int maxFreqSum(String s) {
        int[] fre=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        // 0 4 8 14 20
        int vowel=Integer.MIN_VALUE;
        int conso=Integer.MIN_VALUE;
        for(int i=0;i<fre.length;i++){
            if(i==0 || i== 4 || i==8 || i==14 || i==20){
                vowel=Math.max(vowel,fre[i]);
            }
            else{
                conso=Math.max(conso,fre[i]);
            }
        }
        return vowel+conso;
    }
}