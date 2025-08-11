// Last updated: 12/08/2025, 00:19:00
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ll=new ArrayList<>();
        for(int i=0;i<nums.length;){
            StringBuilder sb=new StringBuilder();
            sb.append(nums[i]);
            int j=i;
            while(j<nums.length-1 && nums[j]+1==nums[j+1]){
                j++;
            }
            if(j!=i) sb.append("->"+nums[j]);
            ll.add(sb.toString());
            i=j+1;
        }
        return ll;
    }
}