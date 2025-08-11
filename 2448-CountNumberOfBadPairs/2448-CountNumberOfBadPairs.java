// Last updated: 12/08/2025, 00:12:00
class Solution {
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        long totpair=(n)*(n-1)/2;
        Map<Integer,Long> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i]-i,map.getOrDefault(nums[i]-i,0l)+1l);
        }
        long c=0;
        for(long i:map.values()){
            if(i>1){
                c+=(i*(i-1)/2);
            }
        }
        return totpair-c;
    }
}