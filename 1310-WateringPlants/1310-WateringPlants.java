// Last updated: 12/08/2025, 00:15:22
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int minstep=0;
        int water=capacity;
        for(int i=0;i<plants.length;i++){
            if(water>=plants[i]){
                water-=plants[i];
                minstep++;
            }
            else{
                water=capacity;
                minstep+=(2*i)+1;
                water-=plants[i];
            }
        }
        return minstep;
    }
}