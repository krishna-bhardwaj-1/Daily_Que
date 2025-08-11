// Last updated: 12/08/2025, 00:13:23
class Solution {
    public boolean areOccurrencesEqual(String s) {
       Map<Character,Integer> freMap=new HashMap<>();
        for(char e:s.toCharArray()){
            if(freMap.containsKey(e)){
                int value=freMap.get(e);
                value++;
                freMap.put(e,value);
            }
            else {
                freMap.put(e,1);
            }
        }
        int val=freMap.get(s.charAt(0));
        for(int entry:freMap.values()){
            if(entry!=val){
                return false;
            }
        }
        return true;
    }
}