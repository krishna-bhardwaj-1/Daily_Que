// Last updated: 12/08/2025, 00:16:49
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int c=0;
        for(char ch:jewels.toCharArray()){
            c+=map.getOrDefault(ch,0);
        }
        return c;
    }
}