// Last updated: 12/08/2025, 00:14:23
class Solution {
    public String restoreString(String s, int[] indices) {
        int len=s.length();
        char[] arr=new char[len];
        for(int i=0;i<len;i++){
            arr[indices[i]]=s.charAt(i);
        }
        String st=new String(arr);
        return st;
    }
}