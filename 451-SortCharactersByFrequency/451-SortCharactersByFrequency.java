// Last updated: 12/08/2025, 00:17:51
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> ll=new ArrayList<>(map.entrySet());
        ll.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ll.size();i++){
            int n=ll.get(i).getValue();
            char ch=ll.get(i).getKey();
            for(int j=0;j<n;j++) sb.append(ch);
        }
        return sb.toString();
    }
}