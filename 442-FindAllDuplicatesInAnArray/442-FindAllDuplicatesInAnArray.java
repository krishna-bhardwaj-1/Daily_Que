// Last updated: 12/08/2025, 00:17:56
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> ll=new ArrayList<>();
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        //     if(map.get(i)>=2){
        //         ll.add(i);
        //     }
        // }
        // return ll;
        int[] a=new int[nums.length+1];
        List<Integer> ll=new ArrayList<>();
        for(int i:nums){
            a[i]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>1){
                ll.add(i);
            }
        }
        return ll;
    }
}