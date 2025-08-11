// Last updated: 12/08/2025, 00:17:14
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        for (int i = 0; i < flowerbed.length;) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                c++;
                i += 2;
            } 
            else i++;
        }
        return c >= n;
    }
}