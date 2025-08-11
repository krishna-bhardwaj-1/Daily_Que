// Last updated: 12/08/2025, 00:16:37
class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr=new int[s.length()];
        int last=Integer.MIN_VALUE/2;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) last=i;
            arr[i]=i-last;
        }

        last=Integer.MAX_VALUE/2;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c) last=i;
            arr[i]=Math.min(arr[i],last-i);
        }
        return arr;
    }
}