// Last updated: 12/08/2025, 00:18:43
class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> ll=new ArrayList<>();
        for(int i:nums){
            if(!ll.contains(i)){
                ll.add(i);
            }
            else{
                ll.remove(Integer.valueOf(i));
            }
        }
        int[] arr=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}