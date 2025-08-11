// Last updated: 12/08/2025, 00:10:16
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] arr=new int[queries.length];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> indexes=map.getOrDefault(nums[i],new ArrayList<>());
            indexes.add(i);
            map.put(nums[i],indexes);
        }

        for(int i=0;i<arr.length;i++){
            List<Integer> indexes=map.getOrDefault(x,new ArrayList<>());
            if(indexes.size()<queries[i]) arr[i]=-1;
            else{
                arr[i]=indexes.get(queries[i]-1);
            }
        }
        return arr;
    }
}