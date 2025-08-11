// Last updated: 12/08/2025, 00:13:33
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr=new int[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']++;
        }
        for(int i:arr){
            if(i<1){
                return false;
            }
        }
        return true;
    }
}