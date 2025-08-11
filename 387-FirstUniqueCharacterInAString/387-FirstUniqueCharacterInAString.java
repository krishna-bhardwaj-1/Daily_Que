// Last updated: 12/08/2025, 00:18:11
class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]+=1;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;
    }
}