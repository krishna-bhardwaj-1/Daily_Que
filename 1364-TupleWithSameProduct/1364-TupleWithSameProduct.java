// Last updated: 12/08/2025, 00:15:16
class Solution {
    public int tupleSameProduct(int[] nums) {
        int c=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int prod=nums[i]*nums[j];
                map.put(prod,map.getOrDefault(prod,0)+1);
            }
        }
        for(int i:map.values()){
            if(i>=2){
                c+=((i*(i-1))/2)*8;
            }
        }
        return c;
    }
}