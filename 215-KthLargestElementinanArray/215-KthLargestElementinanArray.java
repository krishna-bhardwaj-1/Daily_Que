// Last updated: 20/08/2025, 12:18:16
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // for(int i:nums){
        //     pq.add(i);
        //     if(pq.size()>k) pq.poll();
        // }
        // return pq.peek();

        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }

        return pq.poll();
    }
}