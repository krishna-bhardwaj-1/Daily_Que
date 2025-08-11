// Last updated: 12/08/2025, 00:16:16
class Solution {
    public int totalFruit(int[] fruits) {
        int fruit=0;
        Map<Integer,Integer> map=new HashMap<>();
        int st=0;
        int end=0;
        while(end<fruits.length){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size()>2){
                map.put(fruits[st],map.get(fruits[st])-1);
                if(map.get(fruits[st])==0) map.remove(fruits[st]);
                st++;
            }
            fruit=Math.max(fruit,end-st+1);
            end++;
        }
        return fruit;
    }
}