// Last updated: 12/08/2025, 00:10:54
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int x=mainTank;
        int c=0;
        while(x>=5 && additionalTank>0){
            x-=4;
            c++;
            additionalTank--;
        }
        return (mainTank+c)*10;
    }
}