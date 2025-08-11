// Last updated: 12/08/2025, 00:10:40
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ll=new ArrayList<>();
        int turn=groups[0];
        ll.add(words[0]);
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=turn){
                ll.add(words[i]);
                turn=groups[i];
            }
        }
        return ll;
    }
}