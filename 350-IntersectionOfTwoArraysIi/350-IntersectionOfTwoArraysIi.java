// Last updated: 12/08/2025, 00:18:19
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> ll=new ArrayList<>();
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)>0){
                ll.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] arr=new int[ll.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}