// Last updated: 12/08/2025, 00:11:39
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int c=0;
        for(int i:nums){
            if(i%2==0&&i%3==0){
                sum+=i;
                c++;
            }
        }
        if(c==0){
            return 0;
        }
        return sum/c;
    }
}