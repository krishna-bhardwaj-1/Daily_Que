// Last updated: 12/08/2025, 00:14:11
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        // int[] uchai=new int[heights.length];
        // for(int i=1;i<heights.length;i++){
        //     uchai[i]=heights[i]-heights[i-1];
        // }
        // int i=0;
        // for(;i<uchai.length;i++){
        //     if(uchai[i]<=0){
        //         continue;
        //     }
        //     if(uchai[i]<=bricks){
        //         bricks-=uchai[i];
        //     }
        //     else if(ladders>0){
        //         ladders--;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return i-1;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // for(int i=0;i<heights.length-1;i++){
        //     int diff=heights[i+1]-heights[i];
        //     if(diff>0){
        //         if(ladders>0){
        //             pq.add(diff);
        //             ladders--;
        //         }
        //         else{
        //             if(pq.size()>0 && diff>pq.peek()){
        //                 bricks-=pq.poll();
        //                 pq.add(diff);
        //             }
        //             else{
        //                 bricks-=diff;
        //             }
        //             if(bricks<0) return i;
        //         }
        //     }
        // }
        // return heights.length-1;

        for(int i=0;i<heights.length-1;i++){
            int diff=heights[i+1]-heights[i];
            if(diff>0){
                pq.add(diff);

                if(pq.size()>ladders){
                    bricks-=pq.poll();
                }

                if(bricks<0) return i;
            }
        }
        
        return heights.length-1;
    }
}