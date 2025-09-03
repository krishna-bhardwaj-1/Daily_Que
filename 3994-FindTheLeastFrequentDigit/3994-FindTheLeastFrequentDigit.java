// Last updated: 03/09/2025, 11:15:41
class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> map=new TreeMap<>();
        while(n>0){
            int x=n%10;
            map.put(x,map.getOrDefault(x,0)+1);
            n/=10;
        }
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int key:map.keySet()){
            if(map.get(key)<min){
                min=map.get(key);
                ans=key;
            }
        }
        return ans;
    }
}