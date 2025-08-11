// Last updated: 12/08/2025, 00:14:13
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ll=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int[] arr=Arrays.copyOfRange(nums,l[i],r[i]+1);
            if(canMake(arr)){
                ll.add(true);
            }
            else{
                ll.add(false);
            }
        }
        return ll;
    }
    public static boolean canMake(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<2){
            return true;
        }
        int diff=Math.abs(arr[1]-arr[0]);
        for(int i=1;i<arr.length-1;i++){
            if(Math.abs(arr[i+1]-arr[i])!=diff) return false;
        }
        return true;
    }
}