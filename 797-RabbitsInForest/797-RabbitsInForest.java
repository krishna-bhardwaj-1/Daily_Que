// Last updated: 12/08/2025, 00:16:44
class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:answers){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer, Integer> v:map.entrySet()){
            int a=v.getKey();
            int b=v.getValue();
            int size=a+1;
            int grp=(b+size-1)/size;
            sum+=grp*size;
        }
        return sum;
    }
}