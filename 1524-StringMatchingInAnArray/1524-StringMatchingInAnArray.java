// Last updated: 12/08/2025, 00:14:48
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ll=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int  j=0;j<words.length;j++){
                if(words[j].contains(words[i]) && i!=j){
                    ll.add(words[i]);
                    break;
                }
            }
        }
        return ll;
    }
}