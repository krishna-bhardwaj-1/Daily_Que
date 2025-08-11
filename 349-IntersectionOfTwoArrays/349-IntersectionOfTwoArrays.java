// Last updated: 12/08/2025, 00:18:21
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums2){
            set.add(i);
        }
        List<Integer> ll=new ArrayList<>();
        for(int i:nums1){
            if(set.contains(i)){
                ll.add(i);
                set.remove(i);
            }
        }
        int[] arr=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}