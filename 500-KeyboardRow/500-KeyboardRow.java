// Last updated: 12/08/2025, 00:17:40
class Solution {
    public String[] findWords(String[] words) {
        List<String> ll=new ArrayList<>();
        for(String str:words){
            if(helper(str)) ll.add(str);
        }
        return ll.toArray(new String[0]);
    }
    private static boolean helper(String s){
        s=s.toLowerCase();
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        for(int i=0;i<=s.length();i++){
            if(i==s.length()) return true;
            if(s1.indexOf(s.charAt(i))!=-1){
                continue;
            }
            else break;
        }
        for(int i=0;i<=s.length();i++){
            if(i==s.length()) return true;
            if(s2.indexOf(s.charAt(i))!=-1){
                continue;
            }
            else break;
        }
        for(int i=0;i<=s.length();i++){
            if(i==s.length()) return true;
            if(s3.indexOf(s.charAt(i))!=-1){
                continue;
            }
            else break;
        }
        return false;
    }
}