// Last updated: 12/08/2025, 00:14:47
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int i:candies){
            max=Math.max(max,i);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int i:candies){
            if(i+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}