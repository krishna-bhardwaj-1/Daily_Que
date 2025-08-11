// Last updated: 12/08/2025, 00:10:56
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // Set<Integer> set=new HashSet<>();
        // for (int num : nums) {
        //     set.add(num);
        // }
        // int size=set.size();
        // int ans=0;
        // for(int x=0;x<nums.length;x++){
        //     Set<Integer> temp=new HashSet<>();
        //     int i=x;
        //     while(i<nums.length){
        //         temp.add(nums[i]);
        //         if(temp.size()==size) ans++;
        //         else if(temp.size()>size) break;
        //         i++;
        //     }
        // }
        // return ans;

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int size=set.size();
        int si=0,ei=0,ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(ei<nums.length){
            map.put(nums[ei],map.getOrDefault(nums[ei],0)+1);
            while(map.size()==size){
                ans+=nums.length-ei;
                map.put(nums[si],map.getOrDefault(nums[si],0)-1);
                if(map.get(nums[si])==0){
                    map.remove(nums[si]);
                }
                si++;
            }
            ei++;
        }
        return ans;
    }
}