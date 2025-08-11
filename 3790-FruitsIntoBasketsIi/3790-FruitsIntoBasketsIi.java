// Last updated: 12/08/2025, 00:09:17
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int fruitunp=0;
        for(int f:fruits){
            int c=1;
            for(int i=0;i<baskets.length;i++){
                if(f<=baskets[i]){
                    baskets[i]=-1;
                    c=0;
                    break;
                }
            }
            fruitunp+=c;
        }
        return fruitunp;
    }
}