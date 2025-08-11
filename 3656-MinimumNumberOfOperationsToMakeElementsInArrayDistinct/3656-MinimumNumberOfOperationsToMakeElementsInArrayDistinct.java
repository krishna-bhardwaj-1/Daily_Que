// Last updated: 12/08/2025, 00:09:39
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        while(nums.length>0){
            if(isdistinct(nums)) return c;
            else{
                if(nums.length<=3) return ++c;
                nums=Arrays.copyOfRange(nums,3,nums.length);
                c++;
            }
        }
        return c;
    }
    private boolean isdistinct(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            if(!set.contains(i)){
                set.add(i);
            }
            else return false;
        }
        return true;
    }
}