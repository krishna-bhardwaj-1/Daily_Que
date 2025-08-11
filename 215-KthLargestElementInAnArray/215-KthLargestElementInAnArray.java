// Last updated: 12/08/2025, 00:19:06
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int n:nums){
            q.add(n);
            if(q.size()>k) q.poll();
        }
        return q.poll();
    }
}