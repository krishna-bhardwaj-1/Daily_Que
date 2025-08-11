// Last updated: 12/08/2025, 00:09:57
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords){
        HashSet<String> set=new HashSet<>();
        for(String s:bannedWords){
            set.add(s);
        }
        int c=0;
        for(String s:message){
            if(set.contains(s)){
                c++;
                if(c>1){
                    return true;
                }
            }
        }
        return false;
    }
}