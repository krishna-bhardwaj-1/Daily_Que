// Last updated: 12/08/2025, 00:19:40
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split(" +");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        System.out.println(ans);
        return ans.trim();
    }
}