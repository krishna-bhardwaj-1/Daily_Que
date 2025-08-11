// Last updated: 12/08/2025, 00:17:53
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ll=new ArrayList<Integer>();
        boolean[] arr=new boolean[nums.length+1];
        for(int i:nums){
            arr[i]=true;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==false){
                ll.add(i);
            }
        }
        return ll;
    }
}