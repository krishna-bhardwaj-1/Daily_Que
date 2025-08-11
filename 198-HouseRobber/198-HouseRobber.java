// Last updated: 12/08/2025, 00:19:20
class Solution {
    public int rob(int[] nums) {
        int[] cache=new int[nums.length+1];
        Arrays.fill(cache,-1);
        return(maxMoney(nums,0,nums.length,cache));
    }
    private static int maxMoney(int[] house,int curr,int n,int[] cache){
        if(curr>=n){
            return 0;
        }
        if(cache[curr]!=-1){
            return cache[curr];
        }
        //loot liya
        int c1=house[curr]+maxMoney(house,curr+2,n,cache);
        //mat looto
        int c2=maxMoney(house,curr+1,n,cache);
        cache[curr]=Math.max(c1,c2);
        return Math.max(c1,c2);
    }
}