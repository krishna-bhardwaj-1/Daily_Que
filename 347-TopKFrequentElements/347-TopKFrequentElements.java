// Last updated: 12/08/2025, 00:18:22
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> ll=new ArrayList<>(map.entrySet());
        ll.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());

        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=ll.get(i).getKey();
        }
        return arr;
    }
}