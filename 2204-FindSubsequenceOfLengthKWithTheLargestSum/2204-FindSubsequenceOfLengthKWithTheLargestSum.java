// Last updated: 12/08/2025, 00:12:51
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        List<Map.Entry<Integer,Integer>> ll=new ArrayList<>(map.entrySet());
        ll.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());

        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<k;i++){
            set.add(ll.get(i).getKey());
        }
        int[] arr=new int[k];
        int i=0;
        for(int c:set){
            arr[i++]=nums[c];
        }
        return arr;
    }
}